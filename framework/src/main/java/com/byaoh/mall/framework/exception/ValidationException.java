package com.byaoh.mall.framework.exception;

import com.byaoh.mall.framework.web.ResultCode;

/**
 * 参数校验不通过抛出的异常
 *
 * @author luliangyu
 * @date 2021-07-16 14:31
 */
public class ValidationException extends BusinessException {
	private final static Integer CODE = ResultCode.BUSINESS_ERROR.code();

	private String message;

	public ValidationException(String message) {
		this.message = message;
	}

	public ValidationException() {
	}
}
