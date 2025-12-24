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
    public AllocationRule save(@RequestBody AllocationRule rule) {
        return service.save(rule);
    }

    @GetMapping
    public List<AllocationRule> getAll() {
        return service.getAll();
    }
}
