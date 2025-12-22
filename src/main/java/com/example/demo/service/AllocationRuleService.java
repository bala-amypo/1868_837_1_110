package com.example.demo.service;

import com.example.demo.entity.AllocationRule;
import java.util.List;

public interface AllocationRuleService {

    AllocationRule create(AllocationRule rule);

    AllocationRule update(Long id, AllocationRule rule);

    AllocationRule getById(Long id);

    List<AllocationRule> getAll();

    void delete(Long id);
}
