package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        return "index"; // loads index.html
    }

    @GetMapping("/api/info")
    public String info(Model model) {
        model.addAttribute("message", "Java Spring Boot is running on EC2!");
        return "info"; // loads info.html
    }
}
