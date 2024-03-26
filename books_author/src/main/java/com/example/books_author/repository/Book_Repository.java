package com.example.books_author.repository;

import com.example.books_author.dto.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Book_Repository extends JpaRepository<Books,Integer> {

    Books save(Books books);

    Books findBooksByTitle(String title);
}
