package com.byaoh.mall.types;

/**
 * Status
 *
 * @author luliangyu
 * @date 2021-07-28 18:08
 */
public abstract class IntStatus {
	private final int status;

	public IntStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
}
