package com.Library.management.service;

import com.Library.management.model.Resource;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {
    public <T extends Resource> double calculateFee(T resource, int days) {
        return resource.calculateLateFee(days);
    }
}
