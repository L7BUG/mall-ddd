package com.byaoh.mall.web.admin.controller;

import com.byaoh.mall.application.dto.request.BrandQuery;
import com.byaoh.mall.application.dto.response.BrandPage;
import com.byaoh.mall.application.service.BrandApplicationService;
import com.byaoh.mall.framework.web.Page;
import com.byaoh.mall.framework.web.Result;
import com.byaoh.mall.framework.web.ResultFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * BrandController
 *
 * @author luliangyu
 * @date 2021-07-16 17:38
 */
@Validated
@RestController
@RequestMapping("/brand")
public class BrandController {
	private final BrandApplicationService brandApplicationService;

	public BrandController(BrandApplicationService brandApplicationService) {
		this.brandApplicationService = brandApplicationService;
	}

	@GetMapping
	public Result<Page<BrandPage>> get(@Valid BrandQuery query) {
		Page<BrandPage> page = brandApplicationService.page(query);
		return ResultFactory.success(page);
	}
}
