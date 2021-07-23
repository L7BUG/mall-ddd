package com.byaoh.mall.application.assembler;

import cn.hutool.core.util.TypeUtil;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 基础转换接口
 *
 * @author luliangyu
 * @date 2021-07-23 16:15
 */
public interface BaseAssembler<Target> {

	/**
	 * 转换器源对象
	 *
	 * @return
	 */
	default Class<Target> targetClass() {
		Type[] types = this.getClass().getGenericInterfaces();
		for (Type type : types) {
			if (type instanceof ParameterizedType) {
				ParameterizedType parameterizedType = (ParameterizedType) type;
				if (TypeUtil.getClass(parameterizedType) == BaseAssembler.class) {
					return (Class<Target>) TypeUtil.getClass(parameterizedType.getActualTypeArguments()[0]);
				}
			}
		}
		return null;
	}

	/**
	 * 转换
	 * <p>
	 * 默认实现 数据名必须保持一致
	 *
	 * @return 新实例
	 * @throws RuntimeException 复制失败
	 */
	default Target doForward() {
		try {
			Class<Target> targetClass = targetClass();
			if (targetClass == null) {
				throw new RuntimeException();
			}
			Target target = targetClass.getConstructor().newInstance();
			BeanUtils.copyProperties(this, target);
			return target;
		} catch (Exception e) {
			throw new RuntimeException("BaseAssembler默认实现方法有误,请手动重写!");
		}
	}
}
