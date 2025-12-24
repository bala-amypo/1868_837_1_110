package com.example.demo.controller;

import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.RegisterRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {

        AuthResponse response = new AuthResponse();
        response.token = "swagger-demo-token";
        response.userId = 1L;
        response.email = request.email;
        response.role = "USER";

        return response; // ✅ 200 OK
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return "User registered successfully"; // ✅ 200 OK
    }
}
