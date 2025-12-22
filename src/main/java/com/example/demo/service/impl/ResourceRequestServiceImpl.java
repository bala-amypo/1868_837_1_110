package com.example.demo.service.impl;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository requestRepository;

    @Override
    public ResourceRequest save(ResourceRequest request) {
        return requestRepository.save(request);
    }

    @Override
    public List<ResourceRequest> getAll() {
        return requestRepository.findAll();
    }

    @Override
    public ResourceRequest getById(Long id) {
        return requestRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        requestRepository.deleteById(id);
    }
}
