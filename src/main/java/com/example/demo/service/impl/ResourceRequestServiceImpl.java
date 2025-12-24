package com.example.demo.service.impl;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository repo;

    public ResourceRequestServiceImpl(ResourceRequestRepository repo) {
        this.repo = repo;
    }

    public ResourceRequest save(ResourceRequest request) {
        return repo.save(request);
    }

    public List<ResourceRequest> getAll() {
        return repo.findAll();
    }
}
