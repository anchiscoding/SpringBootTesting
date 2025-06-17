package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GETtesting {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
    @GetMapping("/divide")
    public double divide() {
        double a;
        a=10/2;
        return a;
    }
}