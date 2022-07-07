package com.itheima.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/showPage1")
    public String showPage1(){
        System.out.println("user mvc controller is running...");
        return "page.jsp";
    }

    @RequestMapping("/showPage2")
    public String showPage2(){
        System.out.println("user mvc controller is running...");
        return "page.jsp";
    }

    @RequestMapping("/showPage3")
    public String showPage3(){
        System.out.println("user mvc controller is running...");
        return "page.jsp";
    }

    @RequestMapping("/showPage4")
    public String showPage4(){
        System.out.println("user mvc controller is running...");
        return "page.jsp";
    }

    @RequestMapping("/showPage5")
    public String showPage5(){
        System.out.println("user mvc controller is running...");
        return "page.jsp";
    }
}
