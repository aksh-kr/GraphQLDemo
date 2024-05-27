package org.example.graphql.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.example.graphql.models.Book;
import org.example.graphql.services.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {

    private BookService bookService;

    public BookResolver(BookService bookService) {
        this.bookService = bookService;
    }

    public Book getBookById(String id) {
        return bookService.getBookById(id);
    }
}
