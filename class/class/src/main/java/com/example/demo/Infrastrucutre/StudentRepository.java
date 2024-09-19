package com.example.demo.Infrastrucutre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

