package com.itheima.service;

import com.itheima.dao.BookDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService {
    @Value("3")
    private int num;
    @Value("3")
    private  int version;
    @Autowired
    private BookDao bookDao;

    public UserServiceImpl(){
        System.out.println("service running.....");
    }
    public void save() {
        System.out.println("userService running..............."+num+","+version);
        bookDao.save();
    }
}
