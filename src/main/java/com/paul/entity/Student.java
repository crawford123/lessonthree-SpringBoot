package com.paul.entity;

import java.util.Date;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/20/2018
 * Time: 4:26 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class Student {
    private Integer studId;
    private String name;
    private String email;
    private Date dob;
    private Address address;
    private Gender gender;
    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
