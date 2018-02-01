package com.paul.dao;

import com.paul.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository  extends JpaRepository<Users,Long>{

    Users findByUserName(String userName);
    Users findByUserNameOrEmail(String userName,String email);
}
