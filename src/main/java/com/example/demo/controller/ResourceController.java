package com.example.demo.controller;

import com.example.demo.entity.Resource;
import com.example.demo.service.ResourceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    private final ResourceService service;

    public ResourceController(ResourceService service) {
        this.service = service;
    }

    @PostMapping
    public Resource create(@RequestBody Resource resource) {
        return service.create(resource);
    }

    @PutMapping("/{id}")
    public Resource update(@PathVariable Long id, @RequestBody Resource resource) {
        return service.update(id, resource);
    }

    @GetMapping("/{id}")
    public Resource getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Resource> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
