package com.goanna.Repository;

import com.goanna.Entity.Book;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository implements FavBooksRepository {

    private static final List<Book> DATABASE = new ArrayList<>();

    @Override
    public int insertBook(Book book) {
   /*     DATABASE.add(new Book(1, "Eat Pray Love"));
        DATABASE.add(new Book ( 2, "Rich Dad Poor Dad"));
        DATABASE.add(new Book ( 3, "The Fountainhead"));
        DATABASE.add(new Book (4, "Barefoot Investment"));
        DATABASE.add(new Book (5,"Unshakeable")); */
        DATABASE.add(new Book(book.getId(), book.getName()));
        return 1;
    }

    @Override
    public List<Book> getAllBooks() {
        return DATABASE;
    }
}
