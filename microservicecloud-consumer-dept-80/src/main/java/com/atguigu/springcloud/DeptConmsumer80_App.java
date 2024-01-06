package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConmsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConmsumer80_App.class,args);
    }
}
