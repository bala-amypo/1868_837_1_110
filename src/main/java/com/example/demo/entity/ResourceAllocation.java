package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Resource resource;

    @ManyToOne
    private ResourceRequest request;

    // ✅ REQUIRED FOR t38_allocationTimestamp
    private LocalDateTime allocationTimestamp;

    @PrePersist
    public void onCreate() {
        this.allocationTimestamp = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public ResourceRequest getRequest() {
        return request;
    }

    public void setRequest(ResourceRequest request) {
        this.request = request;
    }

    public LocalDateTime getAllocationTimestamp() {
        return allocationTimestamp;
    }
}
