package com.byaoh.mall.infrastructure.config;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 雪花id生成器
 *
 * @author luliangyu
 * @date 2021-06-23 18:32
 */
@Component
public class SnowflakeId implements IdentifierGenerator {

	private static final Snowflake SNOWFLAKE = IdUtil.getSnowflake();

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return SNOWFLAKE.nextId();
	}
}
