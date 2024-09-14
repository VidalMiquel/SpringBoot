package com.example.library.Infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.Domain.Book;

// Manage acces to database
// The repository (databse mangament) knows which entity has to map, thanks to pass it by parameter the entity and PK.
// The mapping is thanks to ORM and JPA (dependencies).
public interface BookRepository extends JpaRepository<Book, Long> {
}