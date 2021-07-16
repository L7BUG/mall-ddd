package com.byaoh.mall.application.service.impl;

import com.byaoh.mall.application.dto.request.BrandQuery;
import com.byaoh.mall.application.dto.response.BrandPage;
import com.byaoh.mall.application.service.BrandApplicationService;
import com.byaoh.mall.framework.web.Page;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * BrandApplicationServiceImpl
 *
 * @author luliangyu
 * @date 2021-07-16 18:00
 */
@Service
public class BrandApplicationServiceImpl implements BrandApplicationService {
	@Override
	public Page<BrandPage> page(BrandQuery query) {
		Page<BrandPage> data = new Page<>();
		data.setTotal(100);
		data.setRows(Arrays.asList(new BrandPage(), new BrandPage(), new BrandPage()));
		return data;
	}
}
