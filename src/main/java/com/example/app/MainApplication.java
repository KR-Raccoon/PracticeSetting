package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainApplication {
    @GetMapping("/hello")
    public String hello() {
        return "hello@!@!@";
    }
}
