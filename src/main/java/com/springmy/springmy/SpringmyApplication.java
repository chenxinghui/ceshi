package com.springmy.springmy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.springmy.springmy.mapper")
@EnableCaching
public class SpringmyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmyApplication.class, args);
    }

}
