package com.bridgelabz.messagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello/{name}")
    public String helloWorld(@PathVariable String name){
        return "Hello "+name;
    }
}
