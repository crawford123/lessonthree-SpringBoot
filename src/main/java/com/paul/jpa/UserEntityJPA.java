package com.paul.jpa;

import com.paul.entity.User;
import com.paul.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import java.io.Serializable;

public interface UserEntityJPA extends JpaRepository<UserEntity,Long>,JpaSpecificationExecutor<UserEntity>,Serializable{




}
