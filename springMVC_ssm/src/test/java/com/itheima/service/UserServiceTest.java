package com.itheima.service;


import com.itheima.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

    //注入需要测试的接口
    @Autowired
    private UserService userService;

    @Test
    public void testSelect(){
        User user = userService.get(1);
        System.out.println(user);
    }
}
