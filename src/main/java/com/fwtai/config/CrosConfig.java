package com.fwtai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决跨域问题
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-24 23:28
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Configuration
public class CrosConfig implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(final CorsRegistry registry){
        registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("GET","HEAD","POST","DELETE","OPTIONS")
        .allowCredentials(true)
        .maxAge(3600L)
        .allowedHeaders("*");
    }
}