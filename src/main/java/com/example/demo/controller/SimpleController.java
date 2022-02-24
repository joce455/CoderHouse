package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.IManageBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleController {

    private IManageBooks manageBooks;

    @Autowired
    SimpleController(IManageBooks manageBooks) {
        this.manageBooks = manageBooks;
    }


    @GetMapping("/book-list")
    public List<Book> listBooks() {
        return manageBooks.listBooks();
    }

    @RequestMapping(value = "/add-book",
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addBook(@RequestBody Book book) {
        manageBooks.addBook(book);
    }


}
