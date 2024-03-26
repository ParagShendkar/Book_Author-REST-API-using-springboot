package com.example.books_author.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_id;
    private String author_name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Books> bookList;

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public List<Books> getBookList() {
        return bookList;
    }

    public void setBookList(List<Books> bookList) {
        this.bookList = bookList;
    }
}
