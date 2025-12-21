package com.example.demo.controller;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    private final ResourceRepository repo;

    public ResourceController(ResourceRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Resource create(@RequestBody Resource resource) {
        return repo.save(resource);
    }

    @GetMapping
    public List<Resource> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Resource getById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Resource update(@PathVariable Long id, @RequestBody Resource resource) {
        Resource existing = repo.findById(id).orElseThrow();
        existing.setResourceName(resource.getResourceName());
        existing.setResourceType(resource.getResourceType());
        existing.setQuantity(resource.getQuantity());
        return repo.save(existing);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "Resource deleted";
    }
}
