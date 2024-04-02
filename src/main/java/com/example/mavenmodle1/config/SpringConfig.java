package com.example.mavenmodle1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"com.example.mavenmodle1.service","com.example.mavenmodle1.mapper","com.example.mavenmodle1.config","com.example.mavenmodle1.controller"})
@Import({SpringConfig_Mybatis.class, JdbcContext.class})
public class SpringConfig {

}
