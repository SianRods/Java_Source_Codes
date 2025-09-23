package com.rods.springjdbc.service;

import com.rods.springjdbc.model.Student;
import com.rods.springjdbc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student s) {
        // saving the student data in the repository
        studentRepository.save(s);
    }


    public List<Student> getStudents() {
    // talk with db and ask to fetch everything
        return studentRepository.findAll();

    }
}
