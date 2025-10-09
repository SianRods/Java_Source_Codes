package com.rods.springsecuritybasics.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping("/home")
    public String getHome(HttpServletRequest request) {
        return "Welcome to Home Page " + request.getSession().getId();
    }

    @PostMapping("/info")
    public String postData(@RequestBody String hello) {
        return "Success";
    }

    @GetMapping("/csrfToken")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }



}
