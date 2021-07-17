package com.byaoh.mall.domain.repository;

import com.byaoh.mall.domain.aggregate.BaseAggregate;
import com.byaoh.mall.types.Identifier;
import com.sun.istack.internal.NotNull;

/**
 * BaseRepository
 *
 * @author luliangyu
 * @date 2021-07-17 11:29
 */
public interface BaseRepository<T extends BaseAggregate<ID>, ID extends Identifier> {
	/**
	 * 根据id获取聚合根对象
	 *
	 * @param id id
	 * @return 匹配的聚合根对象
	 */
	T find(@NotNull ID id);

	/**
	 * 保存一个聚合根对象
	 *
	 * @param t 聚合根对象
	 * @return 保存后的对象
	 */
	T save(@NotNull T t);

	/**
	 * 移除一条信息
	 *
	 * @param t 聚合根
	 */
	void remove(@NotNull T t);
}
