package com.example.demo.service;

import com.example.demo.entity.Resource;
import java.util.List;

public interface ResourceService {
    Resource save(Resource resource);
    List<Resource> getAll();
}
