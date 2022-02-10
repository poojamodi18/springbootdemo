package com.springApp.springbootdemo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@RequestMapping maps only GET method by default to map other HTTP  methods specify it in annotation
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi!";
    }
}
