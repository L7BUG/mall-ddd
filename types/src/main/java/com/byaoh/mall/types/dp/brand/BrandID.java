package com.byaoh.mall.types.dp.brand;

import com.byaoh.mall.framework.exception.ValidationException;
import com.byaoh.mall.types.Identifier;

/**
 * 品牌id DP对象
 *
 * @author luliangyu
 * @date 2021-07-17 11:42
 */
public class BrandID implements Identifier {
	private final Long id;

	public BrandID(Long id) {
		if (id == null || id <= 0) {
			throw new ValidationException("id无效");
		}
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
