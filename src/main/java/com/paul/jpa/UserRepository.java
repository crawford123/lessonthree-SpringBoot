package com.paul.jpa;

import com.paul.entity.User;

import org.springframework.data.repository.CrudRepository;

//由spring自动实现，包含CRUD(Create,Read,Update,Delete)
public interface UserRepository  extends CrudRepository<User,Long>{
}
