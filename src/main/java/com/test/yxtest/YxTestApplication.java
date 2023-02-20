package com.test.yxtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shijialei
 */
@SpringBootApplication
@MapperScan(basePackages = "com.test.yxtest.mapper")
public class YxTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(YxTestApplication.class, args);
    }

}
