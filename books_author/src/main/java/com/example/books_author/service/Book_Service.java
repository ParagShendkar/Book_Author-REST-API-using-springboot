package com.example.books_author.service;

import com.example.books_author.dao.Book_Dao;
import com.example.books_author.dto.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Book_Service {

    @Autowired
    private Book_Dao bookDao;

    public Books saveBooks(Books books){
        return bookDao.saveBooks(books);
    }

    public Optional<Books> findBookById(int id){
        return bookDao.findBooksById(id);
    }

    public List<Books> findAllBooks(Books books){
        return bookDao.findAllBooks(books);
    }

    public void deleteBook(int id){
        bookDao.deleteBook(id);
    }

    public Books updateBookById(long id, Books books){
        return bookDao.updateBookById(id,books);
    }

    public Books findBooksByTitle(String title){
        return bookDao.findBooksByTitle(title);
    }
}
