package com.paul.controller;

import com.paul.entity.UserEntity;
import com.paul.jpa.UserEntityJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/restUserEntity")
public class UserEntityRestController {

    @Autowired
    private UserEntityJPA userEntityJPA;

    /**
     *查询用户列表方法
     * @return
     */

    @RequestMapping(value ="/list",method= RequestMethod.GET)
    public List<UserEntity>  list(){

        return userEntityJPA.findAll();

    }

    /**
     * 添加、更新用户方法
     * @param entity
     * @return
     */
    @RequestMapping(value ="/save",method =RequestMethod.GET)
    public UserEntity save(UserEntity entity) {
       /* if(bindingResult.hasErrors()){
            return "to same page to shows error fields";
        }*/
         return userEntityJPA.save(entity);
    }
    /**
     * 删除用户方法
     * @param id 用户编号
     * @return
     */
    @RequestMapping(value = "/delete",method =RequestMethod.GET)
    public List<UserEntity> delete(Long id)
    {

        userEntityJPA.delete(id);
        return userEntityJPA.findAll();
    }
}
