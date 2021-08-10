package com.books.databaseAPI.service;

import com.books.databaseAPI.entity.Book;
import com.books.databaseAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return repository.saveAll(books);
    }

    public List<Book> getBooks() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "avgRating"));
    }

    public Book getBookById(String id) {
        return repository.findById(id).orElse(null);
    }

    public List<Book> getBookByGenre(String genre){
        return repository.findByGenre(genre);
    }

    public Book getBookByName(String name) {
        return repository.findByName(name);
    }

    public String deleteBook(String id) {
        repository.deleteById(id);
        return "book removed !! " + id;
    }

    public Book updateBook(Book book) {
        Book existingBook = repository.findById(book.getId()).orElse(null);
        //
        assert existingBook != null;
        existingBook.setName(book.getName());
        existingBook.setDescription(book.getDescription());
        existingBook.setPrice(book.getPrice());
        existingBook.setCover(book.getCover());
        existingBook.setGenre(book.getGenre());
        existingBook.setAvgRating(book.getAvgRating());
        existingBook.setAuthor(book.getAuthor());
        return repository.save(existingBook);
    }
}
