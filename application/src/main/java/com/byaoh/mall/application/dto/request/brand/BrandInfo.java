package com.byaoh.mall.application.dto.request.brand;

import com.byaoh.mall.application.assembler.BaseAssembler;
import com.byaoh.mall.domain.aggregate.BrandAggregate;
import lombok.Data;

/**
 * 品牌修改请求对象
 *
 * @author luliangyu
 * @date 2021-07-23 16:08
 */
@Data
public class BrandInfo implements BaseAssembler<BrandAggregate> {
}
