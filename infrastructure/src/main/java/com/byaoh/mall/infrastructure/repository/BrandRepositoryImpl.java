package com.byaoh.mall.infrastructure.repository;

import com.byaoh.mall.domain.aggregate.BrandAggregate;
import com.byaoh.mall.domain.entity.Brand;
import com.byaoh.mall.domain.query.BrandQuery;
import com.byaoh.mall.domain.repository.BrandRepository;
import com.byaoh.mall.framework.web.Page;
import com.byaoh.mall.framework.web.PageQuery;
import com.byaoh.mall.infrastructure.converter.BrandConverter;
import com.byaoh.mall.infrastructure.dao.BrandDao;
import com.byaoh.mall.infrastructure.dataobject.PmsBrandDO;
import com.byaoh.mall.types.dp.brand.BrandID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * BrandRepositoryImpl
 *
 * @author luliangyu
 * @date 2021-07-17 15:12
 */
@Slf4j
@Repository
public class BrandRepositoryImpl implements BrandRepository {
	private final BrandDao brandDao;
	private final BrandConverter brandConverter;

	public BrandRepositoryImpl(BrandDao brandDao, BrandConverter brandConverter) {
		this.brandDao = brandDao;
		this.brandConverter = brandConverter;
	}

	@Override
	public BrandAggregate find(BrandID brandID) {
		PmsBrandDO brand = brandDao.getById(brandID.getId());
		if (brand == null) {
			return null;
		}
		return brandConverter.doToAggregate(brand);
	}

	@Override
	public BrandAggregate save(BrandAggregate brandAggregate) {
		// 获得品牌实体对象
		Brand brand = brandAggregate.getBrand();
		// 保存到数据库
		PmsBrandDO brandDO = brandDao.save(brandConverter.toDo(brand));
		// 给聚合根设置
		brandAggregate.setBrand(brandConverter.doToBrand(brandDO));
		return brandAggregate;
	}

	@Override
	public void remove(BrandAggregate brandAggregate) {

	}

	@Override
	public long count(BrandQuery query) {
		PmsBrandDO brandDO = brandConverter.toDo(query);
		Example<PmsBrandDO> of = Example.of(
			brandDO,
			ExampleMatcher.matching().withMatcher("name", ExampleMatcher.GenericPropertyMatcher::contains)
		);
		return brandDao.count(of);
	}

	@Override
	public Page<BrandAggregate> query(BrandQuery query) {
		PmsBrandDO brandDO = brandConverter.toDo(query);
		Example<PmsBrandDO> of = Example.of(
			brandDO,
			ExampleMatcher.matching().withMatcher("name", ExampleMatcher.GenericPropertyMatcher::contains)
		);
		//设置排序
		PageRequest pageRequest = PageRequest.of(query.getPage() - 1, query.getLimit(), query.getSort() == PageQuery.Sort.DESC ? Sort.Direction.DESC : Sort.Direction.ASC, query.getOrderBy());
		org.springframework.data.domain.Page<PmsBrandDO> data = brandDao.findAll(of, pageRequest);
		System.out.println("data = " + data);
		Page<BrandAggregate> page = new Page<>();
		page.setTotal(data.getTotalElements());
		List<BrandAggregate> collect = data.getContent().stream().map(brandConverter::doToAggregate).collect(Collectors.toList());
		page.setRows(collect);
		return page;
	}
}
