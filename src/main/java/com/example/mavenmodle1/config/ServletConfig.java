package com.example.mavenmodle1.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//定义一个继承了AbstractDispatcherServletInitializer由Servlet启动的配置类,在里面填spring的配置
//该类使得SpringMVC能够被Tomcat加载
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //设置MVC默认拦截所有非.jsp的请求
        return new String[]{"/"};
    }
}
