package com.byaoh.mall.web.admin.controller;

import com.byaoh.mall.application.dto.request.brand.BrandAdd;
import com.byaoh.mall.application.dto.request.brand.BrandQuery;
import com.byaoh.mall.application.dto.response.BrandPage;
import com.byaoh.mall.application.service.BrandApplicationService;
import com.byaoh.mall.framework.web.BasePage;
import com.byaoh.mall.framework.web.Result;
import com.byaoh.mall.framework.web.ResultFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
	public Result<BasePage<BrandPage>> get(@Valid BrandQuery query) {
		BasePage<BrandPage> page = brandApplicationService.page(query);
		return ResultFactory.success(page);
	}

	@PostMapping
	public Result<Void> post(@Valid @RequestBody BrandAdd add) {
		brandApplicationService.add(add);
		return ResultFactory.success();
	}
}
