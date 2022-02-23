package com.example.demo.service;

import com.example.demo.model.Book;


import java.util.List;

public interface IManageBooks {

    void addBook(Book b);

    List<Book> listBooks();

    int totalBooks();

    void removeBook(Long id);
}
