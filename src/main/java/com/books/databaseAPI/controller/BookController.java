package com.books.databaseAPI.controller;


import com.books.databaseAPI.entity.Book;
import com.books.databaseAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> books) {
        return service.saveBooks(books);
    }

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return service.getBooks();
    }

    @GetMapping("/bookById/{id}")
    public Book findBookById(@PathVariable String id) {
        return service.getBookById(id);
    }

    @GetMapping("/book/{name}")
    public Book findBookByName(@PathVariable String name) {
        return service.getBookByName(name);
    }

    @GetMapping("/books/{genre}")
    public List<Book> findBookByGenre(@PathVariable String genre) {
        return service.getBookByGenre(genre);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        return service.deleteBook(id);
    }
}
