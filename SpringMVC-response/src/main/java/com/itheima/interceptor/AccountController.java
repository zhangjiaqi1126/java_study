package com.itheima.interceptor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {
    @RequestMapping("/showData1")
    public void showData1(){

    }

    @RequestMapping("/showData2")
    public void showData2(){

    }

    @RequestMapping("/showData3")
    @ResponseBody
    public String showData3() throws JsonProcessingException {
        Book book = new Book();
        book.setName("springMvc入门案例");
        book.setPrice(111);

        ObjectMapper om = new ObjectMapper();
        return om.writeValueAsString(book);
    }

    @RequestMapping("/showData4")
    @ResponseBody
    public Book showData4(){
        Book book = new Book();
        book.setName("springMvc入门案例");
        book.setPrice(111);
        return book;
    }
}
