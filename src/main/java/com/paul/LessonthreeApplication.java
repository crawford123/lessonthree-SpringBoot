package com.paul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//禁用spring自动配置数据库
@EnableAutoConfiguration
@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan
@ComponentScan
@EnableScheduling//设定定时器
public class LessonthreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LessonthreeApplication.class, args);
	}
}
