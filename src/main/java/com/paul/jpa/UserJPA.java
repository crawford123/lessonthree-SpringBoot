package com.paul.jpa;

import com.paul.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;


import java.io.Serializable;

public interface UserJPA extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable{

    //查询年龄大于20岁的用户
    @Query(value = "select * from user where age > ?1",nativeQuery = true)
    public  List<User> nativeQuery(int age);

//根据用户名、密码删除一条数据,注意需要添加事物注解
    @Transactional
    @Modifying
    @Query(value="delete from user where username = ?1 and password = ?2",nativeQuery = true)

    public void  deleteQuery(String username,String password);

}
