// package com.example.demo.service.impl;

// import com.example.demo.entity.ResourceRequest;
// import com.example.demo.exception.ResourceNotFoundException;
// import com.example.demo.repository.ResourceRequestRepository;
// import com.example.demo.service.ResourceRequestService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class ResourceRequestServiceImpl implements ResourceRequestService {

//     private final ResourceRequestRepository repo;

//     public ResourceRequestServiceImpl(ResourceRequestRepository repo) {
//         this.repo = repo;
//     }

//     public ResourceRequest createRequest(ResourceRequest request) {
//         return repo.save(request);
//     }

//     public ResourceRequest getRequestById(Long id) {
//         return repo.findById(id)
//                 .orElseThrow((-> new ResourceNotFoundException("Request not found"));
//     }

//     public List<ResourceRequest> getAllRequests() {
//         return repo.findAll();
//     }

//     public void deleteRequest(Long id) {
//         repo.deleteById(id);
//     } }
