package com.morry.boot_mvc.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.morry.boot_mvc.interceptor.MyInterceptor;
/**
 * WebMvc配置类
 * @author lenovo
 *
 */
@Configuration
public class MyConfig implements WebMvcConfigurer
{
	public void addInterceptors(InterceptorRegistry registry) {
		//这里可以添加多个拦截器
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
	}
}
