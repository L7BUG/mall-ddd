package com.byaoh.mall.domain.entity;

import com.byaoh.mall.types.brand.*;
import lombok.Data;

/**
 * 品牌实体
 *
 * @author luliangyu
 * @date 2021-07-17 14:59
 */
@Data
public class Brand implements Entity<BrandID> {
	private BrandID brandID;
	private Name name;
	private FirstLetter firstLetter;
	private Sort sort;
	private FactoryStatus factoryStatus;
	private ShowStatus showStatus;
	private Logo logo;
	private BigPic bigPic;
	private BrandStory brandStory;

	public Brand(Name name, Sort sort, FactoryStatus factoryStatus, ShowStatus showStatus) {
		this.name = name;
		this.sort = sort;
		this.factoryStatus = factoryStatus;
		this.showStatus = showStatus;
	}

	public Brand() {
	}

	@Override
	public BrandID getID() {
		return brandID;
	}

	@Override
	public void initDefaultValues() {

	}
}
