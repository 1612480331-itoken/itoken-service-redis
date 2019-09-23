package com.example.itokenserviceredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ItokenServiceRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItokenServiceRedisApplication.class, args);
    }

}
