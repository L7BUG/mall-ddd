package com.byaoh.mall.domain.repository;

import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.types.brand.BrandID;

/**
 * BrandRepository
 *
 * @author luliangyu
 * @date 2021-07-17 10:42
 */
public interface BrandRepository extends Repository<BrandAggregate, BrandID> {
}
