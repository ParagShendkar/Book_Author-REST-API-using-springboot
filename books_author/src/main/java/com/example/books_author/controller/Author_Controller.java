package com.example.books_author.controller;

import com.example.books_author.dto.Author;
import com.example.books_author.service.Author_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Author_Controller {

    @Autowired
    private Author_Service authorService;

    @PostMapping("author/save")
    public Author saveAuthor(@RequestBody  Author author){
        return authorService.saveAuthors(author);
    }

    @GetMapping("author/find/{id}")
    public Optional<Author> findUserById(@PathVariable int id){
        return authorService.findAuthorById(id);
    }

    @GetMapping("author/find_all")
    public List<Author> findAllBooks(Author author){
        return  authorService.findAllAuthors(author);
    }

    @DeleteMapping("author/delete/{id}")
    public void deleteAuthor(@PathVariable int id){
        authorService.deleteAuthor(id);
    }

    @GetMapping("author/findByName/{name}")
    public Author findAuthorByName(@PathVariable String name){
        return authorService.findAuthorByName(name);
    }
}
