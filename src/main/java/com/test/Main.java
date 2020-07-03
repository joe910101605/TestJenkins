package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication

public class Main {

    public static void main(String[] args) {
        //方式一
    SpringApplication.run(Main.class, args);
        //方式二
//        SpringApplication SpringApplication = new SpringApplication(Main.class);
////        SpringApplication.setBannerMode(Banner.Mode.OFF);//关闭banner图
//        SpringApplication.run(args);
    }
}