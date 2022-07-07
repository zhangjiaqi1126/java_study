package com.itheima.interceptor;

import com.itheima.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @RequestMapping("/showPageAndData1")
    public ModelAndView showPageAndData1(ModelAndView modelAndView){
        Book book = new Book();
        book.setName("springMvc入门案例");
        book.setPrice(111);

        modelAndView.addObject("book",book);
        modelAndView.setViewName("page.jsp");

        return modelAndView;
    }

    @RequestMapping("/showPageAndData2")
    public String showPageAndData2(Model model){
        model.addAttribute("name","zhangsan");
        Book book = new Book();
        book.setName("springMvc入门案例");
        book.setPrice(111);
        model.addAttribute("book",book);
        return "page.jsp";

    }

    @RequestMapping("/showPageAndData3")
    public void showPageAndData3(){

    }

    @RequestMapping("/showPageAndData4")
    public void showPageAndData4(){

    }
}
