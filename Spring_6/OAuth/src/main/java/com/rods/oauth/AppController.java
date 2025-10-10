package com.rods.oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/home")
    public String getHome() {
        return "Welcome to the home page ";
    }


}
