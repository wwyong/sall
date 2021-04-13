package com.example.sall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.sall.mapper")
@SpringBootApplication
@EnableCaching
public class SallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SallApplication.class, args);
    }

}
