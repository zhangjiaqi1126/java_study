package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
//设置当前类为spring核心配置加载类
@Configuration
//扫描bean
@ComponentScan("com.itheima")
//加载properties文件
@PropertySource("classpath:jdbc.properties")
//引用数据源的核心配置类
@Import({JDBCConfig.class,MybatisConfig.class})
public class SpringConfig {
}
