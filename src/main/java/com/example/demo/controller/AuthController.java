package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository repo;
    private final JwtUtil jwtUtil = new JwtUtil(
            "test-secret-key-that-is-long-enough-1234", 3600000);

    public AuthController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest req) {
        User user = repo.findByEmail(req.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));

        if (!new BCryptPasswordEncoder()
                .matches(req.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtUtil.generateToken(
                user.getId(), user.getEmail(), user.getRole());

        return new AuthResponse(token, user.getId(),
                user.getEmail(), user.getRole());
    }
}
