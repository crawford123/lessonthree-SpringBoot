package com.paul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 4:10 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@RestController
public class IndexSecurityController {
    @RequestMapping(value = "/index")
    public  String index(){


        return "get index success!!!";

    }
}
