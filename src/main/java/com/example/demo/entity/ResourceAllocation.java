package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ResourceAllocation {
    @Id
    @GeneratedValue
    private Long id;
    private String notes;
}
