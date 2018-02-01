package com.paul.entity;


import com.paul.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User extends BaseEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  Long id;

    @Column(name="username")
    private  String username;

    @Column(name="password")
    private  String password;

    @Column(name="age")
    private int  age;

    @Column(name="address")
    private  String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
