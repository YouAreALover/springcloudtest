package com.lz.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 服务启动后会自动注册到eureka服务中
@EnableDiscoveryClient // 服务发现
@MapperScan("com.lz.springcloud.mapper")
public class MicroserviceProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvider8001Application.class, args);
    }

}
