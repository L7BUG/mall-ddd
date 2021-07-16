package com.byaoh.mall.application.service;

import com.byaoh.mall.application.dto.request.BrandQuery;
import com.byaoh.mall.application.dto.response.BrandPage;
import com.byaoh.mall.framework.web.Page;

/**
 * BrandApplicationService
 *
 * @author luliangyu
 * @date 2021-07-16 17:46
 */
public interface BrandApplicationService {
	/**
	 * 分页查询
	 *
	 * @param query 查询条件
	 * @return 分页对象
	 */
	Page<BrandPage> page(BrandQuery query);
}
