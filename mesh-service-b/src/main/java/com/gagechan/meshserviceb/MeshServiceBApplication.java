package com.gagechan.meshserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class MeshServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeshServiceBApplication.class, args);
    }

}
