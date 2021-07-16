package com.byaoh.mall.framework.web;

/**
 * BaseMallCode
 *
 * @author luliangyu
 * @date 2021-07-16 14:11
 */
public interface BaseMallCode {
	/**
	 * 响应信息
	 *
	 * @return 消息
	 */
	String message();

	/**
	 * 状态码
	 *
	 * @return 状态码
	 */
	Integer code();
}
