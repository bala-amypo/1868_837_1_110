package com.example.demo.service;

import com.example.demo.entity.ResourceRequest;
import java.util.List;

public interface ResourceRequestService {

    ResourceRequest createRequest(ResourceRequest request);

    ResourceRequest getRequestById(Long id);

    List<ResourceRequest> getAllRequests();

    void deleteRequest(Long id);
}
