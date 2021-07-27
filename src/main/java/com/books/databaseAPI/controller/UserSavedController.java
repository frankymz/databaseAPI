package com.books.databaseAPI.controller;


import com.books.databaseAPI.entity.UserSave;
import com.books.databaseAPI.service.UserSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UserSavedController {

    @Autowired
    private UserSaveService userSaveService;

    @PostMapping("/addUserSave")
    public UserSave addUserSave(@RequestBody UserSave userSave){
        return userSaveService.saveUserSave(userSave);
    }

    @GetMapping("userSaved/{user}/{book}")
    public UserSave findUserSaveByUserAndBook(@PathVariable String user, @PathVariable String book){
        return userSaveService.getUserSaveByUserAndBook(user, book);
    }

    @GetMapping("/userSaved")
    public List<UserSave> findAllUserSaved() {
        return userSaveService.getUserSaves();
    }

    @GetMapping("/userSaves/{user}")
    public List<UserSave> findUserSaveByUser(@PathVariable String user) {
        return userSaveService.getUserSaveByUser(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteUserSave( @PathVariable String id) {
        return userSaveService.deleteUserSave(id);
    }

}
