package com.example.library;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        // Contains all generated beans (managed by IoC)
        SpringApplication.run(LibraryApplication.class, args);
    }

}
