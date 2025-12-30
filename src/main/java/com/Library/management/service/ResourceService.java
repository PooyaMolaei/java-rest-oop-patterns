package com.Library.management.service;

import com.Library.management.model.Resource;
import com.Library.management.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {
    @Autowired
    private ResourceRepository repository;

    public Resource getResourceById(Long id) {
        return repository.findById(id);
    }

    public <T extends Resource> double calculateFee(T resource, int days) {
        return resource.calculateLateFee(days);
    }
}
