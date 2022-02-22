package com.example.htmltest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/artikel1")
    public String artikel1(){
        return "artikel1";
    }

    @GetMapping("/artikel2")
    public String artikel2(){
        return "artikel2";
    }

    @GetMapping("/artikel3")
    public String artikel3(){
        return "artikel3";
    }


}
