package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public boolean save(User user);
    /**
     * 修改用户
     * @param user
     * @return
     */
    public  boolean update(User user);
    /**
     * 删除用户
     * @param uuid
     * @return
     */
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
    public List<User> getAll();
    /**
     * 登录
     * @param passWord
     * @return
     */
    public User getUserNameAndPassWord(@Param("username") String userName, @Param("passWord")String passWord);

}
