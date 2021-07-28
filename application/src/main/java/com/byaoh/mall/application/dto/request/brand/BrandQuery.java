package com.byaoh.mall.application.dto.request.brand;

import com.byaoh.mall.application.assembler.BaseAssembler;
import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.domain.entity.Brand;
import com.byaoh.mall.types.brand.Name;
import lombok.Data;

/**
 * BrandQuery
 *
 * @author luliangyu
 * @date 2021-07-16 17:42
 */
@Data
public class BrandQuery implements BaseAssembler<BrandAggregate> {
	/**
	 * 品牌名称
	 */
	private String brandName;

	@Override
	public BrandAggregate doForward() {
		BrandAggregate aggregate = new BrandAggregate();
		Brand brand = new Brand();
		brand.setName(new Name(this.brandName));
		aggregate.setBrand(brand);
		return aggregate;
	}
}
