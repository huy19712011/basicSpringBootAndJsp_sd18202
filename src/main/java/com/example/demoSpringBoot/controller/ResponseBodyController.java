package com.example.demoSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class ResponseBodyController {

    // http::/localhost:8080/default
    @RequestMapping("/default")
    @ResponseBody
    public String responseBody() {
        return "greeting from controller";
    }
}
