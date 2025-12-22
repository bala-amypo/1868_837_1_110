package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repository;

    public ResourceServiceImpl(ResourceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Resource create(Resource resource) {
        return repository.save(resource);
    }

    @Override
    public Resource update(Long id, Resource resource) {
        Resource existing = repository.findById(id).orElseThrow();

        existing.setResourceName(resource.getResourceName());
        existing.setResourceType(resource.getResourceType());
        existing.setCapacity(resource.getCapacity());
        existing.setLocation(resource.getLocation());

        return repository.save(existing);
    }

    @Override
    public Resource getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Resource> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
