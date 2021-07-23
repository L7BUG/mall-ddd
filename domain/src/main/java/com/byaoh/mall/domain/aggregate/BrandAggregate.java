package com.byaoh.mall.domain.aggregate;

import com.byaoh.mall.domain.entity.Brand;
import com.byaoh.mall.types.dp.brand.BrandID;
import lombok.Data;

/**
 * 品牌聚合根
 *
 * @author luliangyu
 * @date 2021-07-17 14:21
 */
@Data
public class BrandAggregate implements Aggregate<BrandID> {

	/**
	 * 品牌实体
	 */
	private Brand brand;

	@Override
	public BrandID getID() {
		return brand.getID();
	}
}
