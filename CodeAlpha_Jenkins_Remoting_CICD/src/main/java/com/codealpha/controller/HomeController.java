package com.codealpha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return """
        <center>
        <h1>CodeAlpha DevOps Internship Task</h1>
        <h2>Jenkins CI/CD Pipeline Demo new change </h2>
        <hr style="width:50%">
        <p>Application built and deployed successfully.</p>
        <p><b>Author:</b> Ahmed Sayed Abd Elbaseer</p>
        </center>
        """;

    }

}