package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;

import java.util.List;

public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;

    public ResourceServiceImpl(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public Resource createResource(Resource resource) {

        if (resource.getResourceType() == null || resource.getCapacity() == null) {
            throw new IllegalArgumentException("Invalid resource");
        }

        if (resource.getCapacity() < 1) {
            throw new IllegalArgumentException("Invalid capacity");
        }

        if (resourceRepository.existsByResourceName(resource.getResourceName())) {
            throw new IllegalArgumentException("Resource exists");
        }

        return resourceRepository.save(resource);
    }

    @Override
    public Resource getResource(Long id) {
        return resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource not found"));
    }

    @Override
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }
}
