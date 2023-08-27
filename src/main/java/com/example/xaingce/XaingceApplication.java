package com.example.xaingce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.example.xaingce.dao")
public class XaingceApplication {





    public static void main(String[] args) {
        SpringApplication.run(XaingceApplication.class, args);
        System.out.println("11111111111");


    }

}
