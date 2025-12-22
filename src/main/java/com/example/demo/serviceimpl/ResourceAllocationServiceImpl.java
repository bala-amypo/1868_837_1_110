// package com.example.demo.service.impl;

// import com.example.demo.entity.ResourceAllocation;
// import com.example.demo.exception.ResourceNotFoundException;
// import com.example.demo.repository.ResourceAllocationRepository;
// import com.example.demo.service.ResourceAllocationService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class ResourceAllocationServiceImpl implements ResourceAllocationService {

//     private final ResourceAllocationRepository repo;

//     public ResourceAllocationServiceImpl(ResourceAllocationRepository repo) {
//         this.repo = repo;
//     }

//     public ResourceAllocation createAllocation(ResourceAllocation allocation) {
//         return repo.save(allocation);
//     }

//     public ResourceAllocation getAllocationById(Long id) {
//         return repo.findById(id)
//                 .orElseThrow(() -> new ResourceNotFoundException("Allocation not found"));
//     }

//     public List<ResourceAllocation> getAllAllocations() {
//         return repo.findAll();
//     }

//     public void deleteAllocation(Long id) {
//         repo.deleteById(id);
//     }
// }
