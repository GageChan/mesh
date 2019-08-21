package com.gagechan.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MeshEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeshEurekaApplication.class, args);
    }

}
