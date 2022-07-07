package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatiesConfig {

    @Bean
   public SqlSessionFactoryBean getSqlSessionFactoryBean(@Autowired DataSource dataSource){
       SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
       ssfb.setTypeAliasesPackage("com.itheima.domain");
       ssfb.setDataSource(dataSource);
       return ssfb;
   }

   @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){
       MapperScannerConfigurer mscf = new MapperScannerConfigurer();
       mscf.setBasePackage("com.itheima.dao");
       return mscf;
   }
}
