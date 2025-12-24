package com.example.demo.service.impl;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceAllocationRepository repo;

    public ResourceAllocationServiceImpl(ResourceAllocationRepository repo) {
        this.repo = repo;
    }

    public ResourceAllocation save(ResourceAllocation allocation) {
        return repo.save(allocation);
    }

    public List<ResourceAllocation> getAll() {
        return repo.findAll();
    }
}
