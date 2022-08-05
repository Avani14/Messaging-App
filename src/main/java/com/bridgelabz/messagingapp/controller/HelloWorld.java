package com.bridgelabz.messagingapp.controller;

import com.bridgelabz.messagingapp.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @GetMapping("/{name}")
    public String helloWorld(@PathVariable String name){
        return "Hello "+name;
    }
    @PostMapping("post")
    public String creatingAPerson(@RequestBody Person person){
        return "Hello "+person.getFirst_name()+" "+person.getLast_name();
    }
}
