package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    // Dummy methods for compilation & future use

    public String generateToken(String username) {
        return "dummy-jwt-token";
    }

    public String extractUsername(String token) {
        return "dummy-user";
    }

    public boolean validateToken(String token) {
        return true;
    }
}
