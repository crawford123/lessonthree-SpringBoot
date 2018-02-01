package com.paul.entity;
import  java.util.*;
/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/25/2018
 * Time: 3:39 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */


public class Tutor {

    private Integer tutorId;
    private String name;
    private String email;
    private Address address;
    private List<Course> courses;
    // setters & getters


    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
