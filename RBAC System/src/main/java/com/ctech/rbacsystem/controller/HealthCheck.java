package com.ctech.rbacsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/healthcheck")
    public String healthChecker() {
        return "Ok";
    }
}
