package com.books.databaseAPI.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private int avg_rating;
}
/*
Get books by genre
Query for top 5 expensive, Top 5 rated, Top 5 most recent
Book pages -> (Author pages, Publisher pages)
 */

