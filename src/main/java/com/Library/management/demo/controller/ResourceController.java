package com.Library.management.demo.controller;
import com.Library.management.demo.model.ApiResponse;
import com.Library.management.demo.model.Movie;
import com.Library.management.demo.model.Book;
import com.Library.management.demo.model.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Library.management.demo.annotation.TrackActivity;

@RestController
@RequestMapping("/api/v1")
public class ResourceController {
    @GetMapping("/movie")
    public ApiResponse<Movie> getMovie() {
        Movie myMovie = new Movie(1L,
                "Inception", "Christopher Nolan");
        return new ApiResponse<>(200, "Success", myMovie);
    }
    @GetMapping("/book")
    public ApiResponse<Book> getBook() {
        Book myBook = new Book(2L,
                "Atomic Habits", "James Clear");
        return new ApiResponse<>(200, "Success", myBook);
    }

    @TrackActivity("Calculating Fees")
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
