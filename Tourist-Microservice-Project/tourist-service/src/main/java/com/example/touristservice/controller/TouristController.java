package com.example.touristservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TouristController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/tourists")
    public List<String> getTourists() {

        return Arrays.asList(
                "Charminar - Hyderabad",
                "Golconda Fort - Hyderabad",
                "Taj Mahal - Agra",
                "Red Fort - Delhi",
                "Gateway of India - Mumbai",
                "Instance running on port: " + port
        );
    }
}