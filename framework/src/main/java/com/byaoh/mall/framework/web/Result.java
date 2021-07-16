package com.byaoh.mall.framework.web;

import lombok.Data;

/**
 * 统一响应对象
 *
 * @author luliangyu
 * @date 2021-07-16 14:10
 */
@Data
public class Result<T> {
	/**
	 * 状态码
	 */
	private Integer code;

	/**
	 * 响应消息
	 */
	private String message;

	/**
	 * 响应数据
	 */
	private T data;
}
