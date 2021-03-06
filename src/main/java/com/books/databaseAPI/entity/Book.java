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
@Table(name = "book")
public class Book {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String cover;
    private String genre;
    @Column(name = "avg_rating")
    private float avgRating;
    private String author;
}


