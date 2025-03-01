package com.example.FirstSpringAppApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController3 {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
