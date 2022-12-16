package com.example.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoApp {

    @GetMapping("/")
    public String helloworld(){
        return "To-do Application ! ";
    }

}
