package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/msg")
    public String home() {
        return "Welcome to API Gateway";
    }

}