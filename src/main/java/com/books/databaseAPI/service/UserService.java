package com.books.databaseAPI.service;

import com.books.databaseAPI.entity.User;
import com.books.databaseAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User saveUser(User user) {
        return repository.save(user);
    }

    public User getUserByPassword(String password) {
        return repository.findByPassword(password);
    }
}
