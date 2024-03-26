package com.example.books_author.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private double price;
    @Column(name = "Published_Date")
    private Date date;
    private int copies;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    @JsonBackReference
    private Author author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
