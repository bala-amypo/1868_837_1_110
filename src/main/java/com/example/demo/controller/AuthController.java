package com.example.demo.controller;

import com.example.demo.dto.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest req) {
        AuthResponse res = new AuthResponse();
        res.token = "swagger-token";
        res.email = req.email;
        res.role = "USER";
        res.userId = 1L;
        return res;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest req) {
        return "User registered successfully";
    }
}
