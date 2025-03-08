package com.example.SimpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HomeController {
    @RequestMapping("/")
    public String hello(){
        return "home page";
    }

    @RequestMapping("/about")
    public String about(){
        return "About page";
    }
}
