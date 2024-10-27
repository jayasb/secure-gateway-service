package com.example.securegatewayservice.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class SecureController {

    @GetMapping("/secure")
    public String secureEndpoint(@AuthenticationPrincipal UserDetails user) {
        return "Secure endpoint accessed by: " + user.getUsername();
    }
}