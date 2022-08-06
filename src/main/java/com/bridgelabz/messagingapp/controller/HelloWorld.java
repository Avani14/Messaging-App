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

    @PostMapping("post")
    public String creatingAPerson(@RequestBody Person person){
        return "Hello "+person.getFirst_name()+" "+person.getLast_name();
    }
    //UC-5
    @PutMapping("put/{first_name}")
    public String updatingPerson(@PathVariable String first_name,@RequestParam String last_name){
        return "Hello "+first_name+" "+last_name;
    }
}
