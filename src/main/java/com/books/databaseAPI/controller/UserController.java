package com.books.databaseAPI.controller;


import com.books.databaseAPI.entity.User;
import com.books.databaseAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/findUser/{password}")
    public User findUserByUsername(@PathVariable String password){
        return service.getUserByPassword(password);
    }
}
