package com.books.databaseAPI.controller;

import com.books.databaseAPI.entity.UserReview;
import com.books.databaseAPI.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class ReviewController {

    @Autowired
    private ReviewService service;

    @GetMapping("/reviews/{book}")
    public List<UserReview> findReviewByBook(@PathVariable String book){
        return service.findReviewByBook(book);
    }

    @PostMapping("/addReview")
    public UserReview addReview(@RequestBody UserReview userReview){
        return service.saveUserReview(userReview);
    }

    @GetMapping("/review/{date}")
    public List<UserReview> findReviewByDate(@PathVariable String date){return service.findReviewByDate(date);}
}
