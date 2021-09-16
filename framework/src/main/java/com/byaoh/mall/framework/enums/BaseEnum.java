package com.byaoh.mall.framework.enums;

import java.io.Serializable;

/**
 * 基本枚举
 *
 * @author l
 * @date 2021-08-15 20:25:49
 */
public interface BaseEnum<V extends Serializable> {
	/**
	 * 返回值
	 *
	 * @return 枚举中的值
	 */
	V getValue();
}
