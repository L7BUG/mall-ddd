package com.byaoh.mall.framework.utils;

import java.util.function.Function;

/**
 * PojoUtil
 *
 * @author luliangyu
 * @date 2021-07-29 09:58
 */
public final class PojoUtil {
	private PojoUtil() {

	}

	public static <O, C1, C2> C2 getField(O o, Function<O, C1> f1, Function<C1, C2> f2) {
		if (o == null || f1 == null || f2 == null) {
			return null;
		}
		C1 c1 = f1.apply(o);
		if (c1 == null) {
			return null;
		}
		return f2.apply(c1);
	}

	public static <O, C1> String getString(O o, Function<O, C1> f1, Function<C1, String> f2) {
		if (o == null || f1 == null || f2 == null) {
			return "";
		}
		C1 c1 = f1.apply(o);
		if (c1 == null) {
			return "";
		}
		String apply = f2.apply(c1);
		return apply == null ? "" : apply;
	}
}
