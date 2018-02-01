package com.paul.controller;

import com.paul.entity.User;
import com.paul.entity.UserEntity;
import com.paul.jpa.UserEntityJPA;
import com.paul.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/userEntity")
public class UserEntityController {

    @Autowired
    private UserEntityJPA userEntityJPA;
    @Autowired
    private UserJPA userJPA;
    /**
     * 添加、更新用户方法
     * @param userEntity
     * @return
     */
    @RequestMapping(value ="/save",method = RequestMethod.GET)
    @ResponseBody
    public UserEntity save(UserEntity userEntity) {
       /* if(bindingResult.hasErrors()){
            return "to same page to shows error fields";
        }*/
        return userEntityJPA.save(userEntity);
    }
    /**
     *查询用户列表方法
     * @return
     */

    @RequestMapping(value ="/list",method= RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> listAllUsers(){

        return userEntityJPA.findAll();

    }
}
