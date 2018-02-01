package com.paul.controller;

import com.paul.entity.GoodEntity;
import com.paul.jpa.GoodJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;
/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/5/2018
 * Time: 10:05 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@RestController
public class QueryController {
   /* @Autowired
    private GoodJPA goodJPA;

    //注入EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(value = "/query")
    public  List<GoodEntity> list(){


        //querydsl查询实体
        //QGoodEntity good

        return null;


    }*/


}
