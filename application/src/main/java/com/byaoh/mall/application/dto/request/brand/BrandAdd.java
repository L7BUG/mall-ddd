package com.byaoh.mall.application.dto.request.brand;

import com.byaoh.mall.application.assembler.BaseAssembler;
import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.domain.entity.Brand;
import com.byaoh.mall.types.brand.*;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 品牌新增请求对象
 *
 * @author luliangyu
 * @date 2021-07-23 16:06
 */
@Data
public class BrandAdd implements BaseAssembler<BrandAggregate> {

	/**
	 * 名称
	 */
	@NotEmpty(message = "名称不能未空")
	private String name;

	/**
	 * 首字母
	 */
	@NotEmpty(message = "首字母 不能未空")
	private String firstLetter;

	/**
	 * 排序
	 */
	@NotNull(message = "排序信息不能未空")
	private Integer sort;

	/**
	 * 是否为品牌制造商：0->不是；1->是
	 */
	@NotNull(message = "是否为品牌制造商：0->不是；1->是 不能未空")
	private Integer factoryStatus;

	/**
	 * 是否显示
	 */
	@NotNull(message = "是否显示 不能未空")
	private Integer showStatus;

	/**
	 * 品牌logo
	 */
	private String logo;

	/**
	 * 专区大图
	 */
	private String bigPic;

	/**
	 * 品牌故事
	 */
	private String brandStory;

	@Override
	public BrandAggregate doForward() {
		BrandAggregate brandAggregate = new BrandAggregate();
		Brand brand = new Brand();
		brandAggregate.setBrand(brand);
		brand.setName(new Name(this.getName()));
		brand.setFirstLetter(new FirstLetter(this.getFirstLetter()));
		brand.setSort(new Sort(this.getSort()));
		brand.setFactoryStatus(new FactoryStatus(this.getFactoryStatus()));
		brand.setShowStatus(new ShowStatus(this.getShowStatus()));
		brand.setLogo(new Logo(this.getLogo()));
		brand.setBigPic(new BigPic(this.getBigPic()));
		brand.setBrandStory(new BrandStory(this.getBrandStory()));
		return brandAggregate;
	}
}
