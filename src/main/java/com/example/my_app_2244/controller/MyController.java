package com.example.my_app_2244.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping
    public String getMethod(){
        return "Hello, From Spring Boot API";
    }

    @PostMapping
    public String postMapping(){
        return "Post Mapping";
    }

}
