package com.books.databaseAPI.controller;


import com.books.databaseAPI.entity.UserSave;
import com.books.databaseAPI.service.UserSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UserSavedController {

    @Autowired
    private UserSaveService userSaveService;

//    @PostMapping("/addSave")
//    public UserSave addUserSave(@RequestBody UserSave userSave){
//        return userSaveService.saveUserSave(userSave);
//    }
//
//    @PostMapping("/addSaved")
//    public List<UserSave> addUserSaves(@RequestBody List<UserSave> userSaves) {
//        return userSaveService.saveUserSaves(userSaves);
//    }

    @GetMapping("/userSaved")
    public List<UserSave> findAllUserSaved() {
        return userSaveService.getUserSaves();
    }

    @GetMapping("/userSaves/{user}")
    public List<UserSave> findUserSaveByUser(@PathVariable String user) {
        return userSaveService.getUserSaveByUser(user);
    }

//    @GetMapping("/userSave/{book_id}")
//    public UserSave findBookByBook_Id(@PathVariable String book_id) {
//        return userSaveService.getBookByBook_Id(book_id);
//    }

//    @PutMapping("/update")
//    public UserSave updateUserSave(@RequestBody UserSave userSave) {
//        return userSaveService.updateUserSave(userSave);
//    }

//    @DeleteMapping("/delete/{book_id}")
//    public String deleteUserSave(@PathVariable String book_id) {
//        return userSaveService.deleteUserSave(book_id);
//    }


}
