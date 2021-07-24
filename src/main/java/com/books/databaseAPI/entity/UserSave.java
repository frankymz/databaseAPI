package com.books.databaseAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_saved_book")
public class UserSave {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "user")
    private String user;
    @Column(name="book")
    private String book;

}