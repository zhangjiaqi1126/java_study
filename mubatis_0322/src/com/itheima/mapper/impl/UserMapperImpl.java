package com.itheima.mapper.impl;

import com.itheima.been.User;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperImpl implements UserMapper {



    @Override
    public List<User> selectAll() {
        //1、加载核心配置文件
        InputStream is = null;
        SqlSession sqlSession = null;
        List<User> list = null;
        try {
            is = Resources.getResourceAsStream("MyBatis-Config.xml");
            //2、获取SqlSession工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //3、通过SqlSession工厂对象获取SqlSession对象
            sqlSession = sqlSessionFactory.openSession();
            //4、执行映射配置文件中的sql语句并执行结果
            list = sqlSession.selectList("UserMapper.selectAll");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //6、释放资源
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if (sqlSession !=null){
                sqlSession.close();
            }
        }
        //返回结果
        return list;
    }

    @Override
    public User selectByUuid(Integer uuid) {
        return null;
    }

    @Override
    public Integer insert(User user) {
        return null;
    }

    @Override
    public Integer update(User user) {
        return null;
    }

    @Override
    public Integer delete(Integer uuid) {
        return null;
    }
}
