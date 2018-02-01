package com.paul.entity;

import  java.util.*;
/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/25/2018
 * Time: 3:36 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class Course {

    private Integer couseId;
    private  String name;
    private  String description;
    private  Date  startDate;
    private  Date  endDate;
    private Integer tutorId;


    public Integer getCouseId() {
        return couseId;
    }

    public void setCouseId(Integer couseId) {
        this.couseId = couseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }
}
