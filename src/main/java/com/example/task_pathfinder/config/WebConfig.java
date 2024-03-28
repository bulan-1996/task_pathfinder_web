package com.example.task_pathfinder.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 *Javaアプリケーションでリクエスト(http://localhost:5173)を許可するクラス
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**")
			.allowedOrigins("http://localhost:5173")
			.allowedMethods("GET","POST","PUT","DELETE");
	}
}
