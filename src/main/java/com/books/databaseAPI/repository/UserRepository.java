package com.books.databaseAPI.repository;

import com.books.databaseAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {
    User findByPassword(String password);
}
