package com.lz.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lz.springcloud.mapper")
public class MicroserviceProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvider8001Application.class, args);
    }

}
