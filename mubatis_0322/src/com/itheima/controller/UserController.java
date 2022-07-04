package com.itheima.controller;

import com.itheima.been.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.junit.Test;

import java.util.List;

public class UserController {

    //创建业务层对象
    UserService userService = new UserServiceImpl();

    @Test
    public void selectAll(){
        List<User>  users = userService.selectAll();
        for (User user:users) {
            System.out.println(user);
        }
    }
}
