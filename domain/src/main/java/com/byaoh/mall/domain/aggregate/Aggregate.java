package com.byaoh.mall.domain.aggregate;

import com.byaoh.mall.types.Identifiable;
import com.byaoh.mall.types.Identifier;

/**
 * 聚合根标识接口
 *
 * @author luliangyu
 * @date 2021-07-17 11:23
 */
public interface Aggregate<ID extends Identifier> extends Identifiable<ID> {
}
