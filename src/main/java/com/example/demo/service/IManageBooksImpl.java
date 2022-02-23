package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IManageBooksImpl implements IManageBooks {

    Map<Long, Book> bookList;

    public IManageBooksImpl() {
        this.bookList = new HashMap<>();
    }


    @Override
    public void addBook(Book book) {
        bookList.put(book.getIsbn(), book);
    }

    @Override
    public List<Book> listBooks() {
        return new ArrayList<>(this.bookList.values());
    }

    @Override
    public int totalBooks() {
        return bookList.size();
    }

    @Override
    public void removeBook(Long id) {
        bookList.remove(id);

    }
}
