package org.example.graphql.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.example.graphql.models.Book;
import org.example.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {

    @Autowired
    private BookService bookService;

    public Book getBookById(String id) {
        return bookService.getBookById(id);
    }
}
