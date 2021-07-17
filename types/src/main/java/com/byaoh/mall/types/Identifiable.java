package com.byaoh.mall.types;

/**
 * ID
 *
 * @author luliangyu
 * @date 2021-07-17 11:19
 */
public interface Identifiable<ID extends Identifier> {
	/**
	 * 获得id
	 *
	 * @return id
	 */
	ID getId();
}
