package com.goanna.Controller;

import com.goanna.Entity.Book;
import com.goanna.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("book")
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    public BookController(BookService personService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping
    public void findAllBooks(){
        bookService.findAllBooks();
    }
}

