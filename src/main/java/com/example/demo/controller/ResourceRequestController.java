package com.example.demo.controller;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.service.ResourceRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resource-requests")
@RequiredArgsConstructor
public class ResourceRequestController {

    private final ResourceRequestService requestService;

    @PostMapping
    public ResponseEntity<ResourceRequest> create(@RequestBody ResourceRequest request) {
        return ResponseEntity.ok(requestService.save(request));
    }

    @GetMapping
    public ResponseEntity<List<ResourceRequest>> getAll() {
        return ResponseEntity.ok(requestService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResourceRequest> getById(@PathVariable Long id) {
        return ResponseEntity.ok(requestService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        requestService.delete(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
