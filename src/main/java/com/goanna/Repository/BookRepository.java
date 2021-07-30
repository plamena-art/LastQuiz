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
        DATABASE.add(new Book(book.getId(), book.getTitle(), book.getAuthor()));
        return 1;
    }

    @Override
    public List<Book> getAllBooks() {
        return DATABASE;
    }

    @Override
    public Book SelectById(int id) {
        Book found = null;

        for(Book book : DATABASE){
            if(book.getId() == id){
                found = book;
            }
        }

        return found;
    }
}
