package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "resource_requests")
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User requestedBy;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private String purpose;

    private String status;

    @OneToOne(mappedBy = "request", cascade = CascadeType.ALL)
    private ResourceAllocation allocation;

    public ResourceRequest() {
        this.status = "PENDING";
    }

    public ResourceRequest(String resourceType, User requestedBy,
                           LocalDateTime startTime, LocalDateTime endTime,
                           String purpose, String status) {
        this.resourceType = resourceType;
        this.requestedBy = requestedBy;
        this.startTime = startTime;
        this.endTime = endTime;
        this.purpose = purpose;
        this.status = (status == null) ? "PENDING" : status;
    }

    public Long getId() { return id; }
}
