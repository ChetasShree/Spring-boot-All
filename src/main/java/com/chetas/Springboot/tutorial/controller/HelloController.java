package com.chetas.Springboot.tutorial.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcome.message}")
    private String welcomeMessage;
//    @GetMapping(path="/helloWorld")
    @RequestMapping(value = "/",method = RequestMethod.GET)
//    public String helloWorld(){
//        return "Hello World from idea intejl aaaa";
//    }
    public String helloWorld(){
        return welcomeMessage;
    }
}

