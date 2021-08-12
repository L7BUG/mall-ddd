package com.byaoh.mall.file.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * FileConfig
 *
 * @author l
 * @date 2021-08-11 23:34:08
 */
@Configuration
@Primary
public class FileConfig implements WebMvcConfigurer {
	@Value("${url-path}")
	private String urlPath;

	@Value("${local-path}")
	private String localPath;

	private String urlPath() {
		return "/" + urlPath + "/**";
	}

	private String localPath() {
		return "file:" + localPath;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(urlPath())
			.addResourceLocations(localPath);
	}
}
