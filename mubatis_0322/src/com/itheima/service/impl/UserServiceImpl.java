package com.itheima.service.impl;

import com.itheima.been.User;
import com.itheima.mapper.UserMapper;
import com.itheima.mapper.impl.UserMapperImpl;
import com.itheima.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    //创建持久层对象
    private  UserMapper userMapper = new UserMapperImpl();

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectByUuid(Integer uuid) {
        return userMapper.selectByUuid(uuid);
    }

    @Override
    public Integer insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }

    @Override
    public Integer delete(Integer uuid) {
        return userMapper.delete(uuid);
    }
}
