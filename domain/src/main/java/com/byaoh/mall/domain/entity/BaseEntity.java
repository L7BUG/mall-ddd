package com.byaoh.mall.domain.entity;

import com.byaoh.mall.types.Identifiable;
import com.byaoh.mall.types.Identifier;

/**
 * 实体类型标记接口
 *
 * @author luliangyu
 * @date 2021-07-17 11:21
 */
public interface BaseEntity<ID extends Identifier> extends Identifiable<ID> {
}
