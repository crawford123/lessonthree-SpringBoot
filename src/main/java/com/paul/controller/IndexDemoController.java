package com.paul.controller;

import com.paul.entity.DemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  java.util.*;
import javax.validation.Valid;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/7/2018
 * Time: 11:43 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@RestController
public class IndexDemoController {
    @Autowired
    private MessageSource messageSource;


    @RequestMapping(value = "/validator")
    public String validator
            (

                    @Valid DemoEntity entity, BindingResult result
            )
    {
        if (result.hasErrors()){

            StringBuffer msg = new StringBuffer();
            //获取错误字段集合
            List<FieldError> fieldErrors = result.getFieldErrors();
            //获取本地locale,zh_CN
            Locale currentLocale = LocaleContextHolder.getLocale();
            //遍历错误字段获取错误信息
            for (FieldError fieldError : fieldErrors) {
                //获取错误信息
                String errorMessage = messageSource.getMessage(fieldError, currentLocale);
                //添加到错误信息集合内
                msg.append(fieldError.getField() + ":" + errorMessage + ",");

            }
            return msg.toString();
        }
        return "验证通过，" + "名称：" + entity.getName() + "，年龄：" + entity.getAge() + "，邮箱地址：" + entity.getMail();
    }

}
