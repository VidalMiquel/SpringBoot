
package com.example.library.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Domain.Book;
import com.example.library.Infrastructure.repository.BookRepository;


@Service
// Contais bussines logic.
// Between contoller and repository.
// Behid a JPA method there is a query (JPA dependency)
// CRUD type operations
public class BookService {

    @Autowired //Injection dependecy
    private BookRepository bookRepository;

    //UPDATE / CREATE query
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // DELETE query
    public void deleteBookById(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        } else {
            throw new RuntimeException("Book not found with id: " + id);
        }
    }

    // GET query
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // GET query
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
}