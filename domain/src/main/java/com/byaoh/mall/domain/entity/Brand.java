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

	@Override
	public BrandID getID() {
		return brandID;
	}
}
