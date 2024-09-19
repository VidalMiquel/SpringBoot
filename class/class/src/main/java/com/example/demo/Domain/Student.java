package com.example.demo.Domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Marks the class as a JPA entity
public class Student {

    // Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment for the primary key
    private Long id;

    // Other fields
    private String name;
    private int DNI;


    // Default constructor required by JPA
    public Student() {
    }

    // Parameterized constructor for easy object creation
    public Student(String name, int DNI) {
        this.DNI = DNI;
        this.name = name;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return DNI;
    }

    public void setDni(int DNI) {
        this.DNI = DNI;
    }



}
