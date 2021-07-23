package com.byaoh.mall.application.service.impl;

import com.byaoh.mall.application.dto.request.brand.BrandAdd;
import com.byaoh.mall.application.dto.request.brand.BrandInfo;
import com.byaoh.mall.application.dto.request.brand.BrandQuery;
import com.byaoh.mall.application.dto.response.BrandPage;
import com.byaoh.mall.application.service.BrandApplicationService;
import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.domain.repository.BrandRepository;
import com.byaoh.mall.framework.web.BasePage;
import com.byaoh.mall.framework.web.PageQuery;
import org.springframework.stereotype.Service;

/**
 * BrandApplicationServiceImpl
 *
 * @author luliangyu
 * @date 2021-07-16 18:00
 */
@Service
public class BrandApplicationServiceImpl implements BrandApplicationService {
	private final BrandRepository brandRepository;

	public BrandApplicationServiceImpl(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public BasePage<BrandPage> page(BrandQuery query) {
		BrandAggregate aggregate = query.doForward();
		BasePage<BrandAggregate> data = brandRepository.query(aggregate, new PageQuery(10, 1, "updateTime", PageQuery.Sort.DESC));
		return null;
	}

	@Override
	public BrandInfo getById(long id) {
		return null;
	}

	@Override
	public void add(BrandAdd brandAdd) {
		BrandAggregate aggregate = brandAdd.doForward();
		brandRepository.save(aggregate);
	}

	@Override
	public void updateById(BrandInfo info) {

	}

	@Override
	public void deleteById(long id) {

	}
}
