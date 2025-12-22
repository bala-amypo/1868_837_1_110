// package com.example.demo.controller;

// import com.example.demo.entity.ResourceAllocation;
// import com.example.demo.repository.ResourceAllocationRepository;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/allocations")
// public class ResourceAllocationController {

//     private final ResourceAllocationRepository repo;

//     public ResourceAllocationController(ResourceAllocationRepository repo) {
//         this.repo = repo;
//     }

//     @PostMapping
//     public ResourceAllocation create(@RequestBody ResourceAllocation allocation) {
//         return repo.save(allocation);
//     }

//     @GetMapping
//     public List<ResourceAllocation> getAll() {
//         return repo.findAll();
//     }

//     @GetMapping("/{id}")
//     public ResourceAllocation getById(@PathVariable Long id) {
//         return repo.findById(id).orElseThrow();
//     }

//     @PutMapping("/{id}")
//     public ResourceAllocation update(@PathVariable Long id,
//                                      @RequestBody ResourceAllocation allocation) {
//         ResourceAllocation existing = repo.findById(id).orElseThrow();
//         existing.setStatus(allocation.getStatus());
//         return repo.save(existing);
//     }

//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         repo.deleteById(id);
//         return "Allocation deleted";
//     }
// }
