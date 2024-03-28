package com.example.books_author.dao;

import com.example.books_author.dto.Author;
import com.example.books_author.repository.Author_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class Author_Dao {

    @Autowired
    private Author_Repository authorRepository;

    //save or create
    public Author saveAuthor(Author author){
        return  authorRepository.save(author);
    }

    public Optional<Author> findAuthorById(int id){
        return  authorRepository.findById(id);
    }

    public List<Author> findAllAuthor(Author author){
        return  authorRepository.findAll();
    }

    public void deleteAuthor(int id){
        authorRepository.deleteById(id);
    }

    public Author updateAuthorById(int id, Author author){
        author.setAuthor_id(id);
        return authorRepository.save(author);
    }

    public Author findAuthorByName(String name){
        return authorRepository.findAuthorByName(name);
    }
}
