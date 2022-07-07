package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    @RequestMapping("/fileupload")
    public  String fileupload(MultipartFile file, HttpServletRequest request) throws IOException {
        //System.out.println("fileupload is running"+file);

        if (!file.isEmpty()){
            String realPath = request.getServletContext().getRealPath("/images");
            file.transferTo(new File(realPath,file.getOriginalFilename()));

        }
        return "page.jsp";
    }
}
