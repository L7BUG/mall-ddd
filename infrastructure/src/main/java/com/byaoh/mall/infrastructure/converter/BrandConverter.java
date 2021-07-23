package com.byaoh.mall.infrastructure.converter;

import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.domain.entity.Brand;
import com.byaoh.mall.infrastructure.dataobject.PmsBrandDO;
import com.byaoh.mall.types.dp.brand.*;
import org.springframework.stereotype.Component;

/**
 * BrandConverter
 * TODO 待优化 过于臃肿
 *
 * @author luliangyu
 * @date 2021-07-17 15:32
 */
@Component
public class BrandConverter {

	public BrandAggregate doToAggregate(PmsBrandDO brandDO) {
		BrandAggregate data = new BrandAggregate();
		data.setBrand(doToBrand(brandDO));
		return data;
	}


	/**
	 * do转换实体对象
	 *
	 * @param brandDO 品牌DO对象
	 * @return 品牌实体对象
	 */
	public Brand doToBrand(PmsBrandDO brandDO) {
		Brand data = new Brand();
		if (brandDO == null) {
			return data;
		}
		data.setBrandID(new BrandID(brandDO.getId()));
		data.setName(new Name(brandDO.getName()));
		data.setFirstLetter(new FirstLetter(brandDO.getFirstLetter()));
		data.setSort(new Sort(brandDO.getSort()));
		data.setFactoryStatus(new FactoryStatus(brandDO.getFactoryStatus()));
		data.setShowStatus(new ShowStatus(brandDO.getShowStatus()));
		data.setLogo(new Logo(brandDO.getLogo()));
		data.setBigPic(new BigPic(brandDO.getBigPic()));
		data.setBrandStory(new BrandStory(brandDO.getBrandStory()));
		return data;
	}

	/**
	 * 领域实体转换为do
	 *
	 * @param brand 实体对象
	 * @return do
	 */
	public PmsBrandDO toDo(Brand brand) {
		PmsBrandDO data = new PmsBrandDO();
		if (brand == null) {
			return data;
		}
		data.setId(brand.getBrandID() == null ? null : brand.getBrandID().getId());
		data.setName(brand.getName() == null ? null : brand.getName().getValue());
		data.setFirstLetter(brand.getFirstLetter() == null ? null : brand.getFirstLetter().getValue());
		data.setSort(brand.getSort() == null ? null : brand.getSort().getValue());
		data.setFactoryStatus(brand.getFactoryStatus() == null ? null : brand.getFactoryStatus().getValue());
		data.setShowStatus(brand.getShowStatus() == null ? null : brand.getShowStatus().getValue());
		data.setLogo(brand.getLogo() == null ? null : brand.getLogo().getValue());
		data.setBigPic(brand.getBigPic() == null ? null : brand.getBigPic().getValue());
		data.setBrandStory(brand.getBrandStory() == null ? null : brand.getBrandStory().getValue());
		return data;
	}
}
