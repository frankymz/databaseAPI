package com.books.databaseAPI.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book_reviews")
public class UserReview {
    @Id
    @Column(name = "reviewid")
    private String reviewid;
    @Column(name = "user")
    private String user;
    @Column(name = "comment")
    private String comment;
    @Column(name = "rating")
    private int rating;
    @Column(name = "book")
    private String book;

}
