package com.abhishek.web.controller;

import com.abhishek.web.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 3/5/2017.
 */
@RestController
public class HelloWorld {

    
    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/greeting")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "Test") String name) {
        return helloWorldService.getMessage() + name;
    }
}
