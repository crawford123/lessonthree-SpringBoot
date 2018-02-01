package com.paul.service;

import com.paul.entity.User;
import com.paul.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/8/2018
 * Time: 10:51 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService {

    @Autowired
    private UserJPA userJPA;

    @Cacheable
    public  List<User> list()
    {
        return  userJPA.findAll();
    }
}



