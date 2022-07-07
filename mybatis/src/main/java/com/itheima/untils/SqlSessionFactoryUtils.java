//package com.itheima.untils;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//
///**
// * 获取可以执行sql的对象session
// *
// * */
//public class SqlSessionFactoryUtils {
//    public static SqlSession getSqlSession() throws IOException {
//        //读取mybatis-config.xml文件
//        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
//        //初始化mybatis,创建SqlSessionFactory类的实例
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        //创建session实例
//        SqlSession session = sqlSessionFactory.openSession();
//        return session;
//    }
//
//}