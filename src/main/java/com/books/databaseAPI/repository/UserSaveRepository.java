package com.books.databaseAPI.repository;

import com.books.databaseAPI.entity.UserSave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserSaveRepository extends JpaRepository<UserSave, String> {
    List<UserSave> findByUser(String user);

    UserSave findByUserAndBook(String user, String book);
}
