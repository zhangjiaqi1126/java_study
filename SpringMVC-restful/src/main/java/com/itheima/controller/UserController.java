package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RequestMapping("/user")
//@ResponseBody
@RestController
public class UserController {
    @RequestMapping("/restLocation")
    public String restLocation(){
        System.out.println("Restful is running");
        return "success.jsp";
    }


    @RequestMapping("{id}")
    public String restLocation(@PathVariable Integer id){
        System.out.println("Restful is running get:"+id);
        return "success.jsp";
    }


    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String get(@PathVariable Integer id){
        System.out.println("Restful is running get:"+id);
        return "success.jsp";
    }

    @RequestMapping(value = "{id}",method = RequestMethod.POST)
    public String post(@PathVariable Integer id){
        System.out.println("Restful is running post:"+id);
        return "success.jsp";
    }

    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public String put(@PathVariable Integer id){
        System.out.println("Restful is running put:"+id);
        return "success.jsp";
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        System.out.println("Restful is running delete:"+id);
        return "success.jsp";
    }
}
