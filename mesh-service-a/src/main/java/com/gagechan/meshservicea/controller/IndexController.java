package com.gagechan.meshservicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2019-08-21 09:37
 * @Created by GageChan
 */

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "Hi " + name + ", I am from port: "  + port;
    }

}
