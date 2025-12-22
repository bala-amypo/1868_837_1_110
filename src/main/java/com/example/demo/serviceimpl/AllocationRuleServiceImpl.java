// package com.example.demo.service.impl;

// import com.example.demo.entity.AllocationRule;
// import com.example.demo.repository.AllocationRuleRepository;
// import com.example.demo.service.AllocationRuleService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class AllocationRuleServiceImpl implements AllocationRuleService {

//     private final AllocationRuleRepository repository;

//     public AllocationRuleServiceImpl(AllocationRuleRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public AllocationRule create(AllocationRule rule) {
//         return repository.save(rule);
//     }

//     @Override
//     public AllocationRule update(Long id, AllocationRule rule) {
//         AllocationRule existing = repository.findById(id).orElseThrow();

//         existing.setRuleName(rule.getRuleName));
//         existing.setRuleType(rule.getRuleType());
//         existing.setPriorityWeight(rule.getPriorityWeight());

//         return repository.save(existing);
//     }

//     @Override
//     public AllocationRule getById(Long id) {
//         return repository.findById(id).orElseThrow();
//     }

//     @Override
//     public List<AllocationRule> getAll() {
//         return repository.findAll();
//     }

//     @Override
//     public void delete(Long id) {
//         repository.deleteById(id);
//     }
// }
