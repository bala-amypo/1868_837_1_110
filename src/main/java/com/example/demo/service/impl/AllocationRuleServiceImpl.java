package com.example.demo.service.impl;

import com.example.demo.entity.AllocationRule;
import com.example.demo.repository.AllocationRuleRepository;
import com.example.demo.service.AllocationRuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AllocationRuleServiceImpl implements AllocationRuleService {

    private final AllocationRuleRepository ruleRepository;

    @Override
    public AllocationRule save(AllocationRule rule) {
        return ruleRepository.save(rule);
    }

    @Override
    public List<AllocationRule> getAll() {
        return ruleRepository.findAll();
    }

    @Override
    public AllocationRule getById(Long id) {
        return ruleRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        ruleRepository.deleteById(id);
    }
}
