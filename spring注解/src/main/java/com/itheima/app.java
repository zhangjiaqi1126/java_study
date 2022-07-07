package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void  main(String[] args){
        //使用xml配置文件格式
//        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) act.getBean("userService");
//        userService.save();
//
//        UserDao userDao = (UserDao) act.getBean("userDao");
//        userDao.save();
//
//        BookDao bookDao = (BookDao) act.getBean("bookDao");
//        bookDao.save();

//        DruidDataSource ds = (DruidDataSource) act.getBean("dataSource");
//        System.out.println(ds);

        //使用注解格式
        ApplicationContext act = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) act.getBean("userService");
        userService.save();

        UserDao userDao = (UserDao) act.getBean("userDao");
        userDao.save();

        BookDao bookDao = (BookDao) act.getBean("bookDao");
        bookDao.save();

        DruidDataSource ds = (DruidDataSource) act.getBean("dataSource");
        System.out.println(ds);
    }

}
