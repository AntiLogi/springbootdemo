package com.cxb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by MyPC on 2017/10/12.
 */
@SpringBootApplication
@MapperScan("com.cxb.mapper")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
