package com.itheima.interceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping("/handleRun")
    public String handleRun(){
        System.out.println("处理器正在运行");
        return "page.jsp";

    }
}
