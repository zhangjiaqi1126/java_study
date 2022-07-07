package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("userDao")
@PropertySource("classpath:/jdbc.properties")
@DependsOn("userService")
public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("dao running.....");
    }

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    public void save() {
        System.out.println("userDao running....."+username+","+password);
    }
}
