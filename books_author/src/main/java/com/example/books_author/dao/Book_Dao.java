package com.example.books_author.dao;

import com.example.books_author.dto.Books;
import com.example.books_author.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class Book_Dao {

    @Autowired
    private Book_Repository bookRepository;

    // create or save
    public Books saveBooks(Books books){
        return  bookRepository.save(books);
    }

    //find book by id
    public Optional<Books> findBooksById(int id){
        return bookRepository.findById(id);
    }

    public List<Books> findAllBooks(Books books){
        return  bookRepository.findAll();
    }

    public void deleteBook(int id){
        bookRepository.deleteById(id);
    }

    public void updateBookById(long id,Books books){
        books.setId(id);
        bookRepository.save(books);
    }

    public Books findBooksByTitle(String title){
        return  bookRepository.findBooksByTitle(title);
    }
}
