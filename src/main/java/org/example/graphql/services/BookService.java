package org.example.graphql.services;

import org.example.graphql.models.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {
    private static final Map<String, Book> books = new HashMap<>();

    static {
        books.put("1", new Book("1", "1984", "George Orwell"));
        books.put("2", new Book("2", "To Kill a Mockingbird", "Harper Lee"));
    }

    public Book getBookById(String id) {
        return books.get(id);
    }
}
