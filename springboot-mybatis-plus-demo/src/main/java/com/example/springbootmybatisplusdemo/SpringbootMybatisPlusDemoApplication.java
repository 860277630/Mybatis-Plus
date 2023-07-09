package com.example.springbootmybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisplusdemo.dao") //扫描mapper文件夹
public class SpringbootMybatisPlusDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusDemoApplication.class, args);
    }

}
