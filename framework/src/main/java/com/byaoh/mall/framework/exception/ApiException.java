package com.byaoh.mall.framework.exception;

import com.byaoh.mall.framework.web.BaseMallCode;

/**
 * ApiException
 *
 * @author luliangyu
 * @date 2021-07-16 14:36
 */
public class ApiException extends MallRuntimeException {
	private BaseMallCode code;
	private String message;

	public ApiException(BaseMallCode code, String message) {
		this.code = code;
		this.message = message;
	}

	public ApiException(BaseMallCode code) {
		this(code, code.message());
	}
}
