package com.rods.springjdbc;


import com.rods.springjdbc.model.*;
import com.rods.springjdbc.repository.*;
import com.rods.springjdbc.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Student s1 = context.getBean(Student.class);
        StudentService studentService = context.getBean(StudentService.class);

        s1.setName("Sian");
        s1.setMarks(86);
        s1.setRollNo(98);

        studentService.addStudent(s1);

        List<Student> studentList = studentService.getStudents();

        System.out.println(studentList);

    }

}
