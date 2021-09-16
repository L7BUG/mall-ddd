package com.byaoh.mall.controller;

import com.byaoh.mall.framework.web.Result;
import com.byaoh.mall.framework.web.ResultFactory;
import com.byaoh.mall.infrastructure.dao.BrandDao;
import com.byaoh.mall.infrastructure.dataobject.PmsBrandDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author l
 * @date 2021-09-04 11:22:34
 */
@RestController
@RequestMapping("/test")
public class TestController {
	private final BrandDao brandDao;

	public TestController(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	@GetMapping
	public Result<Long> test() {
		PmsBrandDO entity = new PmsBrandDO();
		entity.setFactoryStatus(1);
		entity.setName("1234");
		entity.setShowStatus(1);
		brandDao.save(entity);
		return ResultFactory.success(1L);
	}
}
