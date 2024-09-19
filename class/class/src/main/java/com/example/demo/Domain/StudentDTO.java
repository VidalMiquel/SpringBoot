package com.example.demo.Domain;

public class StudentDTO {

    private String name;

    public StudentDTO() {
    }

    // Parameterized constructor for easy object creation
    public StudentDTO( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
