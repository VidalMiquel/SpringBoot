package com.example.library.Domain;


//AS simple as possible with no logic
//We only have the attributs we only want the files we are going to exponse to the client
public class BookDTO {
    private String title;
    private String author;

    // Default constructor
    public BookDTO() {}

    // Parameterized constructor
    public BookDTO(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}