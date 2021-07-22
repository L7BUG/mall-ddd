package com.byaoh.mall.infrastructure.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 商品品牌表
 *
 * @author luliangyu
 * @date 2021-07-16 11:52
 */
@Data
@Entity(name = "pms_brand")
@EqualsAndHashCode(callSuper = true)
public class PmsBrandDO extends BaseDO {

	/**
	 * 名称
	 */
	@Column(name = "name", length = 64, nullable = false)
	private String name;

	/**
	 * 首字母
	 */
	@Column(name = "first_letter", length = 8)
	private String firstLetter;

	/**
	 * 排序
	 */
	@Column(name = "sort")
	private Integer sort;

	/**
	 * 是否为品牌制造商：0->不是；1->是
	 */
	@Column(name = "factory_status", length = 1, nullable = false)
	private Integer factoryStatus;

	/**
	 * 是否显示
	 */
	@Column(name = "show_status", length = 1, nullable = false)
	private Integer showStatus;

	/**
	 * 品牌logo
	 */
	@Column(name = "logo")
	private String logo;

	/**
	 * 专区大图
	 */
	@Column(name = "big_pic")
	private String bigPic;

	/**
	 * 品牌故事
	 */
	@Column(name = "brand_story", columnDefinition = "text comment '描述'")
	private String brandStory;
}
