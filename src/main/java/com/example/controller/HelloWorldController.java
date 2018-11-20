package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
