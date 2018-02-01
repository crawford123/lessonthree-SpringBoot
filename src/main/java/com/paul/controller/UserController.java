package com.paul.controller;

import com.paul.entity.User;
import com.paul.jpa.UserJPA;
import com.paul.jpa.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired//自动注入
    private UserRepository userRepository;
    @Autowired
    private UserJPA userJPA;

  /*  @GetMapping(path = "/add")//只响应GET请求
    public  @ResponseBody String addUser(@RequestParam String username,@RequestParam String password){
        //@ResponseBody表示返回String类型数据
        //@RequestParam表示GET或POST请求的参数
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        User savedUser=userRepository.save(user);
        if(savedUser == null){

            return "error";
        }else {

            return  "add success!";
        }


    }

    @GetMapping(path = "all")
    public  @ResponseBody Iterable<User> getAllUsers(){
        //返回Json格式或xml格式
        return userRepository.findAll();

    }

    @RequestMapping(value = "/alluser",method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> getAllUser(){
        //返回Json格式或xml格式
        return userRepository.findAll();

    }*/

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<User> listAllUsers(){

        return userJPA.findAll();

    }
}
