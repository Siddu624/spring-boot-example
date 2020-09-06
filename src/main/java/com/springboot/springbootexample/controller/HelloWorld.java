package com.springboot.springbootexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {

    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Everyone";
    }
}
