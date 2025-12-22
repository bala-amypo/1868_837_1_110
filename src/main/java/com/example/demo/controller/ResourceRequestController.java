// package com.example.demo.controller;

// import com.example.demo.entity.ResourceRequest;
// import com.example.demo.repository.ResourceRequestRepository;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/requests")
// public class ResourceRequestController {

//     private final ResourceRequestRepository repo;

//     public ResourceRequestController(ResourceRequestRepository repo) {
//         this.repo = repo;
//     }

//     @PostMapping
//     public ResourceRequest create(@RequestBody ResourceRequest request) {
//         return repo.save(request);
//     }

//     @GetMapping
//     public List<ResourceRequest> getAll() {
//         return repo.findAll();
//     }

//     @GetMapping("/{id}")
//     public ResourceRequest getById(@PathVariable Long id) {
//         return repo.findById(id).orElseThrow();
//     }

//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         repo.deleteById(id);
//         return "Request deleted";
//     }
// }
