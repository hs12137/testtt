package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/health")
    public boolean health() {
        return true;
    }

    @GetMapping("/api/version")
    public String version() {
        return "version 2";
    }
}
