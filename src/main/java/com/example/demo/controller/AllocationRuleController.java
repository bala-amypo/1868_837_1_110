package com.example.demo.controller;

import com.example.demo.entity.AllocationRule;
import com.example.demo.service.AllocationRuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allocation-rules")
@RequiredArgsConstructor
public class AllocationRuleController {

    private final AllocationRuleService ruleService;

    @PostMapping
    public ResponseEntity<AllocationRule> create(@RequestBody AllocationRule rule) {
        return ResponseEntity.ok(ruleService.save(rule));
    }

    @GetMapping
    public ResponseEntity<List<AllocationRule>> getAll() {
        return ResponseEntity.ok(ruleService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AllocationRule> getById(@PathVariable Long id) {
        return ResponseEntity.ok(ruleService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        ruleService.delete(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
