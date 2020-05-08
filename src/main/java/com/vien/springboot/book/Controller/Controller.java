package com.vien.springboot.book.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/index")
    public String hello(){
        return "index";
    }



}
