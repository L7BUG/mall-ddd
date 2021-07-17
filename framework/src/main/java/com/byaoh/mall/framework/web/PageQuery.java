package com.byaoh.mall.framework.web;

import lombok.Data;

/**
 * 分页模型
 *
 * @author luliangyu
 * @date 2021-07-17 10:43
 */
@Data
public class PageQuery {
	/**
	 * 显示数量
	 */
	private Integer limit;
	/**
	 * 页码
	 */
	private Integer page;

	/**
	 * 排序列
	 */
	private String orderBy;
	/**
	 * 升降序
	 */
	private String sort;

	public PageQuery() {
		this(10, 1, "update_by", "DESC");
	}

	public PageQuery(Integer limit, Integer page, String orderBy, String sort) {
		this.limit = limit;
		this.page = page;
		this.orderBy = orderBy;
		this.sort = sort;
	}
}
