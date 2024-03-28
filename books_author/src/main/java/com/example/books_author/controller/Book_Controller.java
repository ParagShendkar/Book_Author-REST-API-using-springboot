package com.example.books_author.controller;

import com.example.books_author.dto.Books;
import com.example.books_author.service.Book_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Book_Controller {

    @Autowired
    private Book_Service bookService;

    @PostMapping("books/save")
    public Books saveBooks(@RequestBody Books books){
        return bookService.saveBooks(books);
    }

    @GetMapping("books/find/{id}")
    public Optional<Books> findBookById(@PathVariable int id){
        return bookService.findBookById(id);
    }

    @GetMapping("books/find_all")
    public List<Books> findAllBooks(Books books){
        return bookService.findAllBooks(books);
    }

    @DeleteMapping("book/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
        return "Book Delete successfully";
    }

    @PutMapping("book/update/{id}")
    public Books updateBooks(@PathVariable long id, @RequestBody Books books){
        return bookService.updateBookById(id,books);
    }

    @GetMapping("books/findBooksByTitle/{title}")
    public Books findBookByTitle(@PathVariable String title){
        return bookService.findBooksByTitle(title);
    }
}
