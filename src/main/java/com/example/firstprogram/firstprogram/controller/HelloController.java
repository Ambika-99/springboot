package com.example.firstprogram.firstprogram.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {


    @GetMapping("/helloworld")
    public String sayhello()
    {
        return "hello world";
    }


}
