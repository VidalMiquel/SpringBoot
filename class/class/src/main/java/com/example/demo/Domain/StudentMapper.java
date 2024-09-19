package com.example.demo.Domain;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO studentTOStudentDTO(Student student){
        StudentDTO studentDTO = new StudentDTO(student.getName());
        return studentDTO;
    }

    public Student studentDTOTOStudent(StudentDTO studentDTO){
        Random random = new Random();
        // Generate a random price (for example, between 10,000 and 50,000)
        int randomDNI = 10000 + (50000 - 10000) * random.nextInt(10);
        Student student = new Student(studentDTO.getName(), randomDNI);
        return student;
    }

    public List<StudentDTO> toStudentDTOList(List<Student> students){
        return students.stream()
                    .map(this::studentTOStudentDTO) // Use instance method reference
                    .collect(Collectors.toList());
    }


    
}
