package com.byaoh.mall.infrastructure.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * 填充字段
 *
 * @author luliangyu
 * @date 2021/7/16 13:49
 */
public abstract class MallAuditorAdminId implements AuditorAware<Long> {
	@Override
	public Optional<Long> getCurrentAuditor() {
		return Optional.of(adminId());
	}

	/**
	 * 当前用户的id
	 *
	 * @return 管理员id
	 */
	public abstract Long adminId();
}