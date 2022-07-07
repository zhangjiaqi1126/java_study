package com.itheima.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class,MybatiesConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
