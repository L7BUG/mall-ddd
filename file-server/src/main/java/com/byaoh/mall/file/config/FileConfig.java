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
	@Value("url-path")
	private static String urlPath;

	@Value("localPath")
	private static String localPath;

	private static String urlPath() {
		return "/" + urlPath + "/**";
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	}
}
