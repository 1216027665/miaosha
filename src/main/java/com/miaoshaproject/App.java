package com.miaoshaproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解解释 @EnableAutoConfiguration：将启动类当成一个自动化、可以支持配置的bean，并且能够开启整个工程基于SpringBoot的自动化配置。
 *            SpringBoot的自动化配置：只要EnableAutoConfiguration，SpringBoot项目会把我们对所有的，比如说对数据库的依赖、对redis的依赖、以及对spring容器本身的AOP依赖管理，通通以一个自动化的配置加载到我们对应项目的工程中。
 *
 */
//@EnableAutoConfiguration

/**
 * 注解解释 @SpringBootApplication: 将该类被spring托管，并且指定该类为主启动类
 */
@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"})
@MapperScan("com.miaoshaproject.dao")
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
