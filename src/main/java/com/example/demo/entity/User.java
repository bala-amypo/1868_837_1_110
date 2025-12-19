package com.example.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    @Column(nullable = false, unique = true)
    private String email;
    private String role;
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "requestedBy", cascade = CascadeType.ALL)
    private List<ResourceRequest> resourceRequests;
    public User() {
        this.createdAt = LocalDateTime.now();
        this.role = "USER";
    }
    public User(String fullName, String email, String role) {
        this.fullName = fullName;
        this.email = email;
        this.role = (role == null) ? "USER" : role;
        this.createdAt = LocalDateTime.now();
    }
    public Long getId() { return id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
