package com.books.databaseAPI.service;

import com.books.databaseAPI.entity.UserReview;
import com.books.databaseAPI.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    public List<UserReview> findReviewByBook(String book) {
        return repository.getByBook(book);
    }

    public UserReview saveUserReview(UserReview userReview){
        return repository.save(userReview);
    }

    public List<UserReview> findReviewByDate(String date) {
        return repository.getByDate(date);
    }
}
