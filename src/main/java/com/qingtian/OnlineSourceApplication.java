package com.qingtian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qingtian.mapper")
public class OnlineSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineSourceApplication.class, args);
    }
}
