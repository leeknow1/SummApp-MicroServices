package com.leeknow.summgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SummGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummGatewayApplication.class, args);
    }

}
