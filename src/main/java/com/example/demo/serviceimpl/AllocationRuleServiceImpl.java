package com.example.demo.service.impl;

import com.example.demo.entity.AllocationRule;
import com.example.demo.exception.ResourceNotFoundException;
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

    public AllocationRule createRule(AllocationRule rule) {
        return repo.save(rule);
    }

    public AllocationRule getRuleById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found"));
    }

    public List<AllocationRule> getAllRules() {
        return repo.findAll();
    }

    public AllocationRule updateRule(Long id, AllocationRule rule) {
        AllocationRule existing = getRuleById(id);
        existing.setRuleName(rule.getRuleName());
        existing.setRuleDescription(rule.getRuleDescription());
        return repo.save(existing);
    }

    public void deleteRule(Long id) {
        repo.deleteById(id);
    }
}
