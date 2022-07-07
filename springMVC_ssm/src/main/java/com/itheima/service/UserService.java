package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//开启事务
@Transactional(readOnly = true)
public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Transactional(readOnly = true)
    public boolean save(User user);
    /**
     * 修改用户
     * @param user
     * @return
     */
    @Transactional(readOnly = true)
    public  boolean update(User user);
    /**
     * 删除用户
     * @param uuid
     * @return
     */
    @Transactional(readOnly = false)
    public boolean delete(Integer uuid);
    /**
     * 查询单个
     * @param
     * @return
     */
    public User get(Integer uuid);
    /**
     * 拆线呢全部
     * @param
     * @return
     */
    public PageInfo<User> getAll(int page, int size);
    /**
     * 登录
     * @param passWord
     * @return
     */
    public User login(String userName,String passWord);
}
