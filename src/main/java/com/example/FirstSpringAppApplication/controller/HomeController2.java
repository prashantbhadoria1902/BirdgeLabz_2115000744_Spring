package com.example.FirstSpringAppApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController2 {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello"; // This maps to hello.html in the templates folder
    }
}

