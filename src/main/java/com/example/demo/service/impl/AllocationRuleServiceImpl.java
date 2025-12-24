package com.example.demo.service.impl;

import com.example.demo.entity.AllocationRule;
import com.example.demo.repository.AllocationRuleRepository;
import com.example.demo.service.AllocationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationRuleServiceImpl implements AllocationRuleService {

    private final AllocationRuleRepository repo;

    public AllocationRuleServiceImpl(AllocationRuleRepository repo) {
        this.repo = repo;
    }

    public AllocationRule save(AllocationRule rule) {
        return repo.save(rule);
    }

    public List<AllocationRule> getAll() {
        return repo.findAll();
    }
}
