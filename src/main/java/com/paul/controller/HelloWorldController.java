package com.paul.controller;

import com.paul.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloUser")
public class HelloWorldController {
    @RequestMapping("/hello")
    public  String index(){

        return  "Hello World";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User();
        user.setUsername("小明");
        user.setPassword("123456");
        return user;

    }
}
