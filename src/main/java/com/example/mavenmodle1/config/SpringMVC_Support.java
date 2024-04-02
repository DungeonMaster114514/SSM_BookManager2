package com.example.mavenmodle1.config;


import com.example.mavenmodle1.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMVC_Support extends WebMvcConfigurationSupport {
    @Override
    //添加放行器
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //防止指定路径下get请求mvc被默认拦截(放行指定目录下的请求)
        registry.addResourceHandler("/**").addResourceLocations("/");
    }

    //添加拦截器
    @Autowired
    ProjectInterceptor projectInterceptor;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books/**");
    }
}
