package com.goanna.Controller;

import com.goanna.Entity.Book;
import com.goanna.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/books")
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addNewBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping
    public List<Book> returnAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping(path = "{id}")
    public Book getPupilByID(@PathVariable("id") int id){
        return bookService.getBooksByID(id);
    }
}

