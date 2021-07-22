package com.byaoh.mall.domain.repository;

import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.domain.query.BrandQuery;
import com.byaoh.mall.framework.web.Page;
import com.byaoh.mall.framework.web.PageQuery;
import com.byaoh.mall.types.dp.brand.BrandID;
import com.byaoh.mall.types.dp.brand.Name;

/**
 * BrandRepository
 *
 * @author luliangyu
 * @date 2021-07-17 10:42
 */
public interface BrandRepository extends BaseRepository<BrandAggregate, BrandID> {
	/**
	 * 根据条件获取总数
	 *
	 * @param query 查询条件
	 * @return 符合条件的数量
	 */
	long count(BrandQuery query);

	/**
	 * 分页查询
	 *
	 * @param query 查询条件
	 * @return 符合条件的数据
	 */
	Page<BrandAggregate> query(BrandQuery query);

	/**
	 * 根据 商品名模糊查询
	 *
	 * @param name 商品名
	 * @return 分页数据
	 */
	default Page<BrandAggregate> queryByName(Name name, PageQuery pageQuery) {
		BrandQuery query = new BrandQuery();
		query.setName(name);
		return query(query);
	}
}
