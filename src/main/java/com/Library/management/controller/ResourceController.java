package com.Library.management.controller;
import com.Library.management.model.ApiResponse;
import com.Library.management.model.Movie;
import com.Library.management.model.Book;
import com.Library.management.model.Resource;
import com.Library.management.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/fee/{type}/{days}")
    public ApiResponse<Double> getFee(@PathVariable String type, @PathVariable int days) {
        Resource resource;

        if (type.equalsIgnoreCase("book")) {
            resource = new Book(1L, "Java Basics", "John Doe");
        } else {
            resource = new Movie(2L, "Inception", "Nolan");
        }

        double fee = resource.calculateLateFee(days);

        return new ApiResponse<>(200, "Fee Calculated", fee);
    }
}
