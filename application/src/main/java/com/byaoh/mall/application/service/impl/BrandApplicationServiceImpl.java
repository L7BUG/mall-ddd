package com.byaoh.mall.application.service.impl;

import com.byaoh.mall.application.dto.request.brand.BrandAdd;
import com.byaoh.mall.application.dto.request.brand.BrandInfo;
import com.byaoh.mall.application.dto.request.brand.BrandQuery;
import com.byaoh.mall.application.dto.response.BrandPage;
import com.byaoh.mall.application.service.BrandApplicationService;
import com.byaoh.mall.framework.web.BasePage;
import com.byaoh.mall.infrastructure.dao.BrandDao;
import org.springframework.stereotype.Service;

/**
 * BrandApplicationServiceImpl
 *
 * @author luliangyu
 * @date 2021-07-16 18:00
 */
@Service
public class BrandApplicationServiceImpl implements BrandApplicationService {
	private final BrandDao brandRepository;

	public BrandApplicationServiceImpl(BrandDao brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public BasePage<BrandPage> page(BrandQuery query) {
		return null;
	}

	@Override
	public BrandInfo getById(long id) {
		return null;
	}

	@Override
	public void add(BrandAdd brandAdd) {
	}

	@Override
	public void updateById(BrandInfo info) {

	}

	@Override
	public void deleteById(long id) {

	}
}
