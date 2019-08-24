package com.gagechan.meshservicea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service/a")
public class SwaggerController {

    @RequestMapping("/v2/api-docs")
    public String doc() {
        return "forward:/v2/api-docs";
    }

}
