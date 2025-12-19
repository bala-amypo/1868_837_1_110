package com.example.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "resources", uniqueConstraints = {
        @UniqueConstraint(columnNames = "resourceName")
})
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String resourceName;
    @Column(nullable = false)
    private String resourceType;
    @Column(nullable = false)
    private Integer capacity;
    private String location;
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "resource", cascade = CascadeType.ALL)
    private List<ResourceAllocation> allocations;
    public Resource() {
        this.createdAt = LocalDateTime.now();
    }
    public Resource(String resourceName, String resourceType, Integer capacity, String location) {
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.capacity = capacity;
        this.location = location;
        this.createdAt = LocalDateTime.now();
    }
    public Long getId() { return id; }
    public String getResourceName() { return resourceName; }
    public String getResourceType() { return resourceType; }
    public Integer getCapacity() { return capacity; }
    public String getLocation() { return location; }
}
