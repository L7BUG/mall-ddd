package com.byaoh.mall.application.service;

import com.byaoh.mall.application.dto.request.brand.BrandAdd;
import com.byaoh.mall.application.dto.request.brand.BrandInfo;
import com.byaoh.mall.application.dto.request.brand.BrandQuery;
import com.byaoh.mall.application.dto.response.BrandPage;
import com.byaoh.mall.framework.web.BasePage;

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
	BasePage<BrandPage> page(BrandQuery query);

	/**
	 * 根据id获取单个
	 *
	 * @param id 品牌id
	 * @return 品牌详情
	 */
	BrandInfo getById(long id);

	/**
	 * 新增单个
	 *
	 * @param brandAdd 新增请求对象
	 */
	void add(BrandAdd brandAdd);

	/**
	 * 根据id修改单个
	 *
	 * @param info 修改请求对象
	 */
	void updateById(BrandInfo info);

	/**
	 * 根据id删除单个
	 *
	 * @param id 品牌id
	 */
	void deleteById(long id);
}
