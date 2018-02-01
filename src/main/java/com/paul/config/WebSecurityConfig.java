package com.paul.config;


import org.springframework.context.annotation.Configuration;


/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 3:49 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Configuration
public class WebSecurityConfig { /*extends WebSecurityConfigurerAdapter{

//完成自定义认证实体注入
    @Bean
    UserDetailsService userService(){

        return new UsersService();

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()//所有请求必须登陆后访问
                .and()
                   .formLogin()
                   .loginPage("/login")
                   .failureUrl("/login?error")
                   .permitAll()//登录界面，错误界面可以直接访问
                .and()
                .logout()
                .permitAll();//注销请求可直接访问

    }
*/




}
