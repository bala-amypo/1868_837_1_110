package com.example.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "allocation_rules", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ruleName")
})
public class AllocationRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String ruleName;
    private String ruleType;
    private Integer priorityWeight;
    private LocalDateTime createdAt;
    public AllocationRule() {
        this.createdAt = LocalDateTime.now();
    }
    public AllocationRule(String ruleName, String ruleType, Integer priorityWeight) {
        this.ruleName = ruleName;
        this.ruleType = ruleType;
        this.priorityWeight = priorityWeight;
        this.createdAt = LocalDateTime.now();
    }
}
