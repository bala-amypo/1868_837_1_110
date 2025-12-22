package com.example.demo.service;

import com.example.demo.entity.Resource;
import java.util.List;

public interface ResourceService {

    Resource create(Resource resource);

    Resource update(Long id, Resource resource);

    Resource getById(Long id);

    List<Resource> getAll();

    void delete(Long id);
}
