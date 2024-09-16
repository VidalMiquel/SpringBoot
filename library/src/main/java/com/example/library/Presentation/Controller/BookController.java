package com.example.library.Presentation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.Application.service.BookService;
import com.example.library.Domain.Book; //map a rquestbook (BIEL)
import com.example.library.Domain.BookDTO;

// Type controller --> serve data to client in JSON/XML format
@RestController
//Used to map HTTP requests --> http://localhost:8080/books
@RequestMapping("/books")
public class BookController {

    @Autowired //Depency injection
    private BookService bookService;

    // POST request to add a new book
    //@PostMapping
    //public Book addBook(@RequestBody Book book) {
    //    return bookService.saveBook(book);
    //}

    @PostMapping
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) {
        try {
            bookService.createBook(bookDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(bookDTO);
        } catch (IllegalArgumentException e) {
            // Handle specific exception (for example, invalid input)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } catch (Exception e) {
            // Handle any other exceptions
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                .body(null); // Or return an error object with details
        }
    }

    // DELETE request to delete a book by its ID
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        try {
            bookService.deleteBookById(id);
            return "Book deleted successfully.";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    // GET request to retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // GET request to retrieve a book by its ID
    //@GetMapping("/{id}")
    //public Optional<Book> getBookById(@PathVariable Long id) {
    //    return bookService.getBookById(id);
    //}

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
        BookDTO bookDTO = bookService.getBookById(id);
        return ResponseEntity.ok(bookDTO);
    }
}
