// package com.example.demo.controller;

// import com.example.demo.dto.LoginRequest;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.entity.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.security.JwtUtil;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/auth")
// public class AuthController {

//     private final UserRepository userRepository;
//     private final PasswordEncoder passwordEncoder;
//     private final JwtUtil jwtUtil;

//     public AuthController(UserRepository userRepository,
//                           PasswordEncoder passwordEncoder,
//                           JwtUtil jwtUtil) {
//         this.userRepository = userRepository;
//         this.passwordEncoder = passwordEncoder;
//         this.jwtUtil = jwtUtil;
//     }

//     @PostMapping("/register")
//     public String register(@RequestBody RegisterRequest request) {
//         User user = new User();
//         user.setName(request.getName());
//         user.setEmail(request.getEmail());
//         user.setPassword(passwordEncoder.encode(request.getPassword()));
//         user.setRole(request.getRole());
//         userRepository.save(user);
//         return "User registered successfully";
//     }

//     @PostMapping("/login")
//     public String login(@RequestBody LoginRequest request) {
//         User user = userRepository.findByEmail(request.getEmail())
//                 .orElseThrow(() -> new RuntimeException("Invalid credentials"));

//         if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
//             throw new RuntimeException("Invalid credentials");
//         }

//         return jwtUtil.generateToken(user.getEmail());
//     }
// }
