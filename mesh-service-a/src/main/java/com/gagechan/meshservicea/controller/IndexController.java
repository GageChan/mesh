package com.gagechan.meshservicea.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2019-08-21 09:37
 * @Created by GageChan
 */

@RestController
@RequestMapping("/service/a")
@Api(tags = "首页")
public class IndexController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return "Hi " + name + ", I am from port: "  + port;
    }

}
