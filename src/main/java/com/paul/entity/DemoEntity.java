package com.paul.entity;

import com.paul.validator.FlagValidator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/7/2018
 * Time: 11:39 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class DemoEntity implements Serializable{


    @NotBlank
    @Length(min = 2,max = 10)
    private  String name;

    @Min(value = 1)
    private  int age;

    @NotBlank
    @Email
    private  String mail;

    @FlagValidator(values = "1,2,3")
    private String  flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}