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

    public ResourceRequest() {}

    public ResourceRequest(String resourceType, User requestedBy,
                           LocalDateTime startTime, LocalDateTime endTime,
                           String purpose) {
        this.resourceType = resourceType;
        this.requestedBy = requestedBy;
        this.startTime = startTime;
        this.endTime = endTime;
        this.purpose = purpose;
    }

    @PrePersist
    public void onCreate() {
        if (this.status == null) {
            this.status = "PENDING";
        }
    }

    // getters and setters
}
