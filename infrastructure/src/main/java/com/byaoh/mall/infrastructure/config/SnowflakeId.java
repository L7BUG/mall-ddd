package com.byaoh.mall.infrastructure.config;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * 雪花id生成器
 *
 * @author luliangyu
 * @date 2021-06-23 18:32
 */
public class SnowflakeId implements IdentifierGenerator {

    public SnowflakeId() {
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return null;
    }
}
