package com.byaoh.mall.application.dto.response;

import lombok.Data;

/**
 * 分页品牌列表
 *
 * @author luliangyu
 * @date 2021-07-16 17:43
 */
@Data
public class BrandPage {

	private Long id;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 首字母
	 */
	private String firstLetter;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 是否为品牌制造商：0->不是；1->是
	 */
	private Integer factoryStatus;

	/**
	 * 是否显示
	 */
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
}
