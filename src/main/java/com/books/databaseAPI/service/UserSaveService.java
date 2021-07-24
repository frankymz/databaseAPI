package com.books.databaseAPI.service;

import com.books.databaseAPI.entity.UserSave;
import com.books.databaseAPI.repository.UserSaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSaveService {

    @Autowired
    private UserSaveRepository userSaveRepository;

//    public UserSave saveUserSave(UserSave userSave){return userSaveRepository.save(userSave);}
//
//    public List<UserSave> saveUserSaves(List<UserSave> userSaves) {
//        return userSaveRepository.saveAll(userSaves);
//    }

    public List<UserSave> getUserSaves() {
        return userSaveRepository.findAll();
    }

    public List<UserSave> getUserSaveByUser(String user) {
        return userSaveRepository.findByUser(user);
    }

//
//    public String deleteUserSave(String book_id){
//        userSaveRepository.deleteByBook_Id(book_id);
//        return "book_id deleted";
//    }
}
