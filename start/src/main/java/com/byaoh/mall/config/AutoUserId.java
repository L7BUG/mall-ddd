package com.byaoh.mall.config;

import com.byaoh.mall.infrastructure.config.MallAuditorAdminId;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * AutoUserId
 *
 * @author luliangyu
 * @date 2021-07-23 15:12
 */
@Component
public class AutoUserId extends MallAuditorAdminId {
	@Value("${adminId}")
	private Long adminId;

	@Override
	public Long adminId() {
		return adminId;
	}
}
