package com.example.library.Application;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom; // Import for generating random numbers

import com.example.library.Domain.Book;
import com.example.library.Domain.BookDTO;

@Component
public class BookMapper {


    // Maps BookDTO to Book entity
    public Book bookDTOToBook(BookDTO bookDTO) {
        // Generate a random number between 0 and 20,000
        int randomId = ThreadLocalRandom.current().nextInt(0, 20001);
        
        // Convert the random number to a String to simulate an ISBN
        String isbn = String.valueOf(randomId);
        
        // Assuming Book has a constructor that takes title, author, and isbn (as String)
        return new Book(bookDTO.getTitle(), bookDTO.getAuthor(), isbn); // Pass the random value as ISBN (String)
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
