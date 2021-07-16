package com.byaoh.mall.framework.web;

/**
 * ResultCode
 *
 * @author luliangyu
 * @date 2021-07-16 14:11
 */
public enum ResultCode implements BaseMallCode {

	/**
	 * 成功调用
	 */
	SUCCESS(200, "成功"),
	/**
	 * 业务错误
	 */
	BUSINESS_ERROR(400, "业务错误"),
	/**
	 * 服务应用异常
	 */
	FAILED(500, "操作失败"),
	;

	ResultCode(Integer code, String message) {
		this.message = message;
		this.code = code;
	}

	private final Integer code;

	private final String message;


	@Override
	public String message() {
		return message;
	}

	@Override
	public Integer code() {
		return code;
	}
}
