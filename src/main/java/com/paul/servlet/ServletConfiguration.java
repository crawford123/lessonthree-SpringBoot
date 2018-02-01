package com.paul.servlet;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/21/2018
 * Time: 2:30 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Configuration
/*@ServletComponentScan*/
public class ServletConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistrationBean()
    {


        return  new ServletRegistrationBean(new TestServlet(),"/test");

    }
}
