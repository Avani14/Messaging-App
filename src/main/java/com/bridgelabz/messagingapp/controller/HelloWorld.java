package com.bridgelabz.messagingapp.controller;

import com.bridgelabz.messagingapp.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @GetMapping("/query")
    public String helloWorld(@RequestParam String name){
        return "Hello "+name;
    }
}
