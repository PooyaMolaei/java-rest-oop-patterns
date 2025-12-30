package com.Library.management.repository;

import com.Library.management.model.Book;
import com.Library.management.model.Movie;
import com.Library.management.model.Resource;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResourceRepository {
    private final List<Resource> database = new ArrayList<>();

    public ResourceRepository() {
        // Initializing with some mock data
        database.add(new Book(1L, "Clean Code", "Robert Martin"));
        database.add(new Movie(2L, "Inception", "Christopher Nolan"));
    }

    public List<Resource> findAll() {
        return database;
    }

    public Resource findById(Long id) {
        return database.stream()
                .filter(r -> r.getId() == (id))
                .findFirst()
                .orElse(null);
    }
}
