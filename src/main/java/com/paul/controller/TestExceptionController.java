package com.paul.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 11:03 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@RestController
public class TestExceptionController {


    @RequestMapping(value = "/index/{number}")
    public  String index(@PathVariable int number){
        System.out.println(20/number);
        return  "get index page successfully.";
    }
}
