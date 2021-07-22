package com.byaoh.mall.domain.query;

import com.byaoh.mall.framework.web.PageQuery;
import com.byaoh.mall.types.dp.brand.Name;
import lombok.Data;


/**
 * BrandQuery
 *
 * @author luliangyu
 * @date 2021-07-17 14:23
 */
@Data
public class BrandQuery extends PageQuery {
	private Name name;
}
