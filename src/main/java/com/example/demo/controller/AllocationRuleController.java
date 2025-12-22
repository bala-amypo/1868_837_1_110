package com.example.demo.controller;

import com.example.demo.entity.AllocationRule;
import com.example.demo.service.AllocationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class AllocationRuleController {

    private final AllocationRuleService service;

    public AllocationRuleController(AllocationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public AllocationRule create(@RequestBody AllocationRule rule) {
        return service.create(rule);
    }

    @PutMapping("/{id}")
    public AllocationRule update(@PathVariable Long id, @RequestBody AllocationRule rule) {
        return service.update(id, rule);
    }

    @GetMapping("/{id}")
    public AllocationRule getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<AllocationRule> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
