package com.example.demoSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=Poly&location=Hanoi
    @RequestMapping("/login")
    public String goToLoginPage(
            @RequestParam String name,
            @RequestParam(name = "location", required = false, defaultValue = "Vietnam") String address,
            ModelMap model) {

        model.put("name", name);
        model.put("address", address);
        return "login";
    }
}
