package com.itheima.service;

import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public int save(int i, int m){
        System.out.println("user service running..."+i+","+m);
        return 100;
    }

}
