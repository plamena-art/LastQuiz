package com.goanna.Repository;

import com.goanna.Entity.Book;

import java.util.List;

public interface FavBooksRepository {
    int insertBook(Book book);

    List<Book> getAllBooks();

    Book SelectById(int id);
}
