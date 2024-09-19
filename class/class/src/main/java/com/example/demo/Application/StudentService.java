package com.example.demo.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Infrastrucutre.StudentRepository;
import com.example.demo.Domain.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;

    public Student createStudent(StudentDTO studentDTO){
        Student student = studentMapper.studentDTOTOStudent(studentDTO);
        return studentRepository.save(student);
    }

    public StudentDTO getStudentbyID(Long id){
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return studentMapper.studentTOStudentDTO(student);
    }

    // Eliminar un coche por ID
    public boolean deleteById(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
