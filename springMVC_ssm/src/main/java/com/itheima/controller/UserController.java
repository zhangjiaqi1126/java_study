package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.controller.results.Code;
import com.itheima.controller.results.Result;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//设置rest风格的控制器
@RestController
//设置公共访问路径，配合下方访问路径使用
@RequestMapping("/user")
public class UserController {

    //注入UserService
    @Autowired
    private UserService userService;

    //rest风格访问路径完整书写方式
    @RequestMapping("/{uuid}")
    //使用@PathVariable注解获取路径上配置的具名变量，该配置可以使用多次
    public Result getUser(@PathVariable Integer uuid) {
        User user =  userService.get(1);
        return new Result(null !=user? Code.GET_OK:Code.GET_ERROR,user);
    }


    @PostMapping
    public Result save(User user){
        boolean flag =  userService.save(user);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERROR);
    }

    @PutMapping()
    public boolean update(User user){

        return userService.update(user);

    }
//
//    @DeleteMapping("/{id}")
//    public boolean delete(@PathVariable Integer uuid){
//        return userService.delete(1);
//
//    }
//
//    //rest风格访问路径完整书写方式
//    @GetMapping("/{page}/{size}")
//    //使用@PathVariable注解获取路径上配置的具名变量，该配置可以使用多次
//    public PageInfo<User> getall(@PathVariable Integer page, @PathVariable Integer size) {
//        return userService.getAll(page,size);
//    }
}
