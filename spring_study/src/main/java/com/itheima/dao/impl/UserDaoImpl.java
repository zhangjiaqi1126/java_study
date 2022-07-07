package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String username;
    private String pwd;

    public UserDaoImpl(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    @Override
    public void save() {
        System.out.println("user dao running"+","+username+","+pwd);
    }
}
