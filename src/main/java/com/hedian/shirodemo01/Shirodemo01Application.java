package com.hedian.shirodemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hedian.shirodemo01.mapper")
public class Shirodemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Shirodemo01Application.class, args);
    }
}
