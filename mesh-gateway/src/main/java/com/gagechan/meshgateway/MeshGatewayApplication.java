package com.gagechan.meshgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MeshGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeshGatewayApplication.class, args);
    }

}
