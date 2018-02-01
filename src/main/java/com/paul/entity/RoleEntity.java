package com.paul.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/8/2018
 * Time: 5:38 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Entity
@Table(name = "roles")
public class RoleEntity implements Serializable{
    @Id
    @Column(name = "r_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  id;

    @Column(name = "r_name")
    private  String  name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
