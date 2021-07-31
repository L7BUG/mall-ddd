package com.byaoh.mall.infrastructure.dataobject;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.sql.BitTypeDescriptor;

public class Class extends AbstractSingleColumnStandardBasicType<String> {
    public Class() {
        super(new BitTypeDescriptor(), new ClassDescriptor());
    }

    @Override
    public String getName() {
        return "Class";
    }

    @Override
    public Object resolve(Object value, SharedSessionContractImplementor session, Object owner, Boolean overridingEager) throws HibernateException {
        return null;
    }

}
