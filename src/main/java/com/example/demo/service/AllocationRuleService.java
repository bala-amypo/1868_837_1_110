package com.example.demo.service;

import com.example.demo.entity.AllocationRule;
import java.util.List;

public interface AllocationRuleService {
    AllocationRule save(AllocationRule rule);
    List<AllocationRule> getAll();
    AllocationRule getById(Long id);
    void delete(Long id);
}
