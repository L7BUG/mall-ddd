package com.byaoh.mall.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * infrastructure模块配置
 *
 * @author l
 * @date 2021-09-04 10:52:43
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "mall.file")
public class InfrastructureProperties {

	/**
	 * 本地文件存储路径
	 */
	private String localPath = "~/.java-app/mall-ddd/";
}
