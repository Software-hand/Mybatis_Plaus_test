package com.rjs.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rjs.mybatisplus.mapper")  // Spring 扫描 mapper 接口所在包
public class MybatisplausApplication {



    public static void main(String[] args) {
        SpringApplication.run(MybatisplausApplication.class, args);
    }

}
