package com.byaoh.mall.framework.web;

import lombok.Data;

import java.util.Collection;

/**
 * 统一分页响应对象
 *
 * @author luliangyu
 * @date 2021-07-16 14:44
 */
@Data
public class BasePage<T> {
	/**
	 * 总条数
	 */
	private long total;

	/**
	 * 分页数据
	 */
	private Collection<T> rows;
}
