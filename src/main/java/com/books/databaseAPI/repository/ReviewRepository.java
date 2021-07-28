package com.books.databaseAPI.repository;

import com.books.databaseAPI.entity.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<UserReview, String> {
    List<UserReview> getByBook(String book);
}
