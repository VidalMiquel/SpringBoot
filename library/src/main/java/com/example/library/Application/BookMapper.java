package com.example.library.Application;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.library.Domain.Book;
import com.example.library.Domain.BookDTO;

@Component
public class BookMapper {

    // Maps BookDTO to Book entity
    public Book bookDTOToBook(BookDTO bookDTO) {
        // Assuming Book has a constructor that takes title, author, and id
        return new Book(bookDTO.getTitle(), bookDTO.getAuthor(), null); // Use null or a proper ID as needed
    }

    // Maps Book entity to BookDTO
    public BookDTO bookToBookDTO(Book book) {
        return new BookDTO(book.getTitle(), book.getAuthor()); // Ensure BookDTO has an ID field
    }

    // Maps a list of Book entities to a list of BookDTOs
    public List<BookDTO> toDTOList(List<Book> books) {
        return books.stream()
                    .map(this::bookToBookDTO) // Use instance method reference
                    .collect(Collectors.toList());
    }
}
