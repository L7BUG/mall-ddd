package com.byaoh.mall.infrastructure.dataobject;

import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.ImmutableMutabilityPlan;
import org.hibernate.type.descriptor.spi.JdbcRecommendedSqlTypeMappingContext;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

public class ClassDescriptor extends AbstractTypeDescriptor<String> {

    protected ClassDescriptor() {
        super(String.class, new ImmutableMutabilityPlan<>());
    }

    @Override
    public String toString(String value) {
        return null;
    }

    @Override
    public String fromString(String string) {
        return null;
    }

    @Override
    public <X> X unwrap(String value, Class<X> type, WrapperOptions options) {
        return null;
    }

    @Override
    public <X> String wrap(X value, WrapperOptions options) {
        return null;
    }

    @Override
    public SqlTypeDescriptor getJdbcRecommendedSqlType(JdbcRecommendedSqlTypeMappingContext context) {
        return null;
    }


}
