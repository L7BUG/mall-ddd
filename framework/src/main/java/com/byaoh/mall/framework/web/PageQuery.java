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
	private Sort sort;

	public PageQuery() {
		this(10, 1, "updateTime", Sort.DESC);
	}

	public PageQuery(Integer limit, Integer page, String orderBy, Sort sort) {
		this.limit = limit;
		this.page = page;
		this.orderBy = orderBy;
		this.sort = sort;
	}

	public enum Sort {
		DESC("desc"),
		ASC("asc"),
		;
		private String value;

		Sort(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
