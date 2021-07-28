package com.byaoh.mall.types;

/**
 * LongId
 *
 * @author luliangyu
 * @date 2021-07-28 18:02
 */
public class LongId implements Identifier {
	private final Long id;

	public LongId(Long id) {
		if (id == null || id <= 0) {
			throw new IllegalArgumentException("id无效");
		}
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
