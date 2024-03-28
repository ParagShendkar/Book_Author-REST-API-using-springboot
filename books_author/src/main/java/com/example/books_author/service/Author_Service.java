package com.example.books_author.service;

import com.example.books_author.dao.Author_Dao;
import com.example.books_author.dto.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Author_Service {

    @Autowired
    private Author_Dao authorDao;

    public Author saveAuthors(Author author){
        return authorDao.saveAuthor(author);
    }

    public Optional<Author> findAuthorById(int id){
        return authorDao.findAuthorById(id);
    }

    public List<Author> findAllAuthors(Author author){
        return authorDao.findAllAuthor(author);
    }

    public void deleteAuthor(int id){
        authorDao.deleteAuthor(id);
    }

    public void updateAuthor(int id, Author author){
        authorDao.updateAuthorById(id, author);
    }

    public Author findAuthorByName(String name){
        return authorDao.findAuthorByName(name);
    }

    public Author updateAuthorById(int id, Author author) {
        return authorDao.updateAuthorById(id, author);
    }
}
