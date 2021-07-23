package com.byaoh.mall.domain.repository;

import com.byaoh.mall.domain.aggregate.Aggregate;
import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.framework.web.BasePage;
import com.byaoh.mall.framework.web.PageQuery;
import com.byaoh.mall.types.Identifier;
import com.sun.istack.internal.NotNull;

/**
 * 仓库基础接口
 *
 * @author luliangyu
 * @date 2021-07-17 11:29
 */
public interface Repository<A extends Aggregate<ID>, ID extends Identifier> {
	/**
	 * 根据id获取聚合根对象
	 *
	 * @param id id
	 * @return 匹配的聚合根对象
	 */
	A find(@NotNull ID id);

	/**
	 * 保存一个聚合根对象
	 *
	 * @param aggregate 聚合根对象
	 * @return 保存后的对象
	 */
	A save(@NotNull A aggregate);

	/**
	 * 移除一条信息
	 *
	 * @param aggregate 聚合根
	 */
	void remove(@NotNull A aggregate);

	/**
	 * 根据聚合根条件统计总数
	 *
	 * @param query 查询条件
	 * @return 总条数
	 */
	long count(A query);

	/**
	 * 根据条件查询
	 *
	 * @param query 查询条件
	 * @param page  分页参数
	 * @return 分页对象
	 */
	BasePage<BrandAggregate> query(A query, PageQuery page);
}
