package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.IManageBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleController {

    private IManageBooks manageBooks;

    @Autowired
    SimpleController(IManageBooks manageBooks) {
        this.manageBooks = manageBooks;
    }

    @GetMapping("/total-books")
    public String totalBooks() {
        return "{\"totalBooks\":" + manageBooks.totalBooks() + "}";
    }

    @RequestMapping(value = "/book-list",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> listBooks() {
        return manageBooks.listBooks();
    }

    @RequestMapping(value = "/add-book",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody Book book) {
        manageBooks.addBook(book);
    }



}
