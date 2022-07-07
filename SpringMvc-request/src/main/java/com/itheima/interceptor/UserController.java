package com.itheima.interceptor;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/requestParam1")
    public String requestParam1(){
        System.out.println();
        return "page.jsp";
    }

    @RequestMapping("/requestParam2")
    public String requestParam2(User user){
        System.out.println(user);
        return "page.jsp";
    }

    @RequestMapping("/requestParam3")
    public String requestParam3(){
        System.out.println();
        return "page.jsp";
    }

    @RequestMapping("/requestParam4")
    public String requestParam4(){
        System.out.println();
        return "page.jsp";
    }

    @RequestMapping("/requestParam5")
    public String requestParam5(){
        System.out.println();
        return "page.jsp";
    }

    @RequestMapping("/requestParam6")
    public String requestParam6(){
        System.out.println();
        return "page.jsp";
    }

    @RequestMapping("/requestParam7")
    public String requestParam7(){
        System.out.println();
        return "page.jsp";
    }

    @RequestMapping("/requestParam8")
    public String requestParam8(){
        System.out.println();
        return "page.jsp";
    }

    @RequestMapping("/requestParam9")
    public String requestParam9(){
        System.out.println();
        return "page.jsp";
    }
}
