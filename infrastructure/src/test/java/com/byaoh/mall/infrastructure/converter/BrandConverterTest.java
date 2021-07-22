package com.byaoh.mall.infrastructure.converter;

import com.byaoh.mall.infrastructure.dataobject.PmsBrandDO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BrandConverterTest {
    private BrandConverter brandConverter;

    @BeforeEach
    void setUp() {
        brandConverter = new BrandConverter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void doToBrand() {
        PmsBrandDO brandDO = new PmsBrandDO();
        brandDO.setId(1L);
        brandDO.setName("小米");
        System.out.println("brandConverter.doToBrand(brandDO) = " + brandConverter.doToBrand(brandDO));
    }
}