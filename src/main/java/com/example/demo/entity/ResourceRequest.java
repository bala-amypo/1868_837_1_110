package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ResourceRequest {
    @Id
    @GeneratedValue
    private Long id;
    private String purpose;
    private String status;
}
