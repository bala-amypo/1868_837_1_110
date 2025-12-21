package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repo;

    public ResourceServiceImpl(ResourceRepository repo) {
        this.repo = repo;
    }

    public Resource createResource(Resource resource) {
        return repo.save(resource);
    }

    public Resource getResourceById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
    }

    public List<Resource> getAllResources() {
        return repo.findAll();
    }

    public Resource updateResource(Long id, Resource resource) {
        Resource existing = getResourceById(id);
        existing.setResourceName(resource.getResourceName());
        existing.setResourceType(resource.getResourceType());
        existing.setQuantity(resource.getQuantity());
        return repo.save(existing);
    }

    public void deleteResource(Long id) {
        repo.deleteById(id);
    }
}
