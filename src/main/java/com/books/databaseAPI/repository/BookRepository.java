package com.books.databaseAPI.repository;

import com.books.databaseAPI.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
    Book findByName(String name);
}


