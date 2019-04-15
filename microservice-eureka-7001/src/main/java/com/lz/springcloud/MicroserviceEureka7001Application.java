package com.lz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //EurekaServer服务端启动类，接受其他微服务注册进来
public class MicroserviceEureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEureka7001Application.class, args);
    }

}
