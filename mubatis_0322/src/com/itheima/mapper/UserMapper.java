package com.itheima.mapper;

import com.itheima.been.User;

import java.util.List;

public interface UserMapper {
    public  abstract List<User> selectAll();

    public  abstract User selectByUuid(Integer uuid);

    public abstract Integer insert(User user);

    public abstract Integer update(User user);

    public abstract Integer delete(Integer uuid);

}
