package com.example.books_author.repository;

import com.example.books_author.dto.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Author_Repository extends JpaRepository<Author,Integer> {

    Author save(Author author);

    @Query("SELECT a FROM Author a WHERE a.author_name = :a_name")
    Author findAuthorByName(@Param("a_name")String name);
}
