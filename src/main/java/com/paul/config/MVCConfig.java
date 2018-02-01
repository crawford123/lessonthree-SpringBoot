package com.paul.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 4:06 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       /* registry.addViewController("/login").setViewName("LoginSecurity");*/
    }
}
