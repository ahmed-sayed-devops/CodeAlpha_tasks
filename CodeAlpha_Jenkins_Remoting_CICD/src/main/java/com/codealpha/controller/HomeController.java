package com.codealpha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return """
        CodeAlpha DevOps Internship Task
        Jenkins CI/CD Pipeline Demo
        -----------------------------
        Application built and deployed successfully.
        Author: Ahmed Sayed Abd Elbaseer
        """;

    }

}