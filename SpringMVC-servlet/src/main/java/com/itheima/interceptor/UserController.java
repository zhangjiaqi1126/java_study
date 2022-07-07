package com.itheima.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes(names = {"name"})
public class UserController {
    @RequestMapping("/servletApi")
    public String servletApi(){
        System.out.println();
        return "page";
    }

    @RequestMapping("/headApi")
    public String headApi(@RequestHeader("Accept-Encoding") String headmsg){
        System.out.println(headmsg);
        return "page";
    }


    @RequestMapping("/cookieApi")
    public String cookieApi(@CookieValue("JSESSIONID") String JSESSIONID){
        System.out.println(JSESSIONID);
        return "page";
    }

    @RequestMapping("/sessionGetData")
    public String showPage1(@SessionAttribute("name") String name){
        System.out.println(name);
        return "page";
    }

    @RequestMapping("/sessionSetData")
    public String session(Model model){
        model.addAttribute("name","zhangjiaqi");
        return "page";
    }
}
