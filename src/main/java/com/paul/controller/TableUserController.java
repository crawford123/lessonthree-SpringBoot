package com.paul.controller;

import com.paul.entity.TableUser;
import  java.util.*;
import com.paul.mapper.TableUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/15/2018
 * Time: 11:25 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */

@EnableTransactionManagement // 需要事务的时候加上
@RestController
public class TableUserController {

   /* @Autowired
    private TableUserMapper tableUserMapper;


    @RequestMapping("/save")
    public  Integer save(){
        TableUser tableUser = new TableUser();
        tableUser.setName("张三");
        tableUser.setPassword("123456");
        tableUser.setPhone("123456789");
        tableUserMapper.insert(tableUser);

        return  tableUser.getId();
    }

    @RequestMapping("/update")
    public  Long update(){
        TableUser tableUser = new TableUser();
        tableUser.setId(2);
        tableUser.setName("汪汪");
        tableUser.setPassword("11111111111");
        tableUser.setPhone("138023234589");

        return  tableUserMapper.update(tableUser);
    }

    @RequestMapping("/selectAll")
    public List<TableUser> selectAll() {
        return tableUserMapper.selectAll();
    }*/

}
