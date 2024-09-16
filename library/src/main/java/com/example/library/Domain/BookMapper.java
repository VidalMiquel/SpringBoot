package com.example.library.Domain;

import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    // Maps BookDTO to Book entity
    // Create method manaually
    public Book bookDTOToBook(BookDTO bookDTO){
        return new Book(bookDTO.getTitle(), bookDTO.getAuthor(),  "4");
    }

    public BookDTO bookTOBookDTO(Book book){
        return new BookDTO(book.getTitle(), book.getAuthor());
    }
}
