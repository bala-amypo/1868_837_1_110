package com.example.demo.controller;

import com.example.demo.entity.AllocationRule;
import com.example.demo.repository.AllocationRuleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class AllocationRuleController {

    private final AllocationRuleRepository repo;

    public AllocationRuleController(AllocationRuleRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public AllocationRule create(@RequestBody AllocationRule rule) {
        return repo.save(rule);
    }

    @GetMapping
    public List<AllocationRule> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public AllocationRule getById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public AllocationRule update(@PathVariable Long id,
                                 @RequestBody AllocationRule rule) {
        AllocationRule existing = repo.findById(id).orElseThrow();
        existing.setRuleName(rule.getRuleName());
        existing.setRuleDescription(rule.getRuleDescription());
        return repo.save(existing);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "Rule deleted";
    }
}
