// package com.example.demo.service.impl;

// import com.example.demo.entity.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class UserServiceImpl implements UserService {

//     private final UserRepository repo;

//     public UserServiceImpl(UserRepository repo) {
//         this.repo = repo;
//     }

//     public User create(User user) {
//         return repo.save(user);
//     }

//     public List<User> getAll() {
//         return repo.findAll();
//     }

//     public User getById(Long id) {
//         return repo.findById(id).orElseThrow();
//     }}
