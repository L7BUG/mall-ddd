package com.byaoh.mall.infrastructure.repository;

import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.domain.entity.Brand;
import com.byaoh.mall.domain.repository.BrandRepository;
import com.byaoh.mall.types.dp.brand.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BrandRepositoryImplTest {

	@Autowired
	private BrandRepository brandRepository;

	@BeforeEach
	void setUp() {
		System.out.println("brandRepository = " + brandRepository.getClass());
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	void find() {
	}

	@Test
	void save() {
		BrandAggregate data = new BrandAggregate();
		Brand brand = new Brand();
		data.setBrand(brand);
		brand.setName(new Name("小米"));
		brand.setFirstLetter(new FirstLetter("X"));
		brand.setSort(new Sort(1));
		brand.setFactoryStatus(new FactoryStatus(1));
		brand.setShowStatus(new ShowStatus(1));
		brand.setBrandStory(new BrandStory("不会百度?"));
		brandRepository.save(data);
		System.out.println("data = " + data);
	}

	@Test
	void remove() {
	}

	@Test
	void count() {
	}

	@Test
	void query() {
	}
}