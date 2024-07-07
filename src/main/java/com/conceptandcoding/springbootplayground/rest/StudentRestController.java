package com.conceptandcoding.springbootplayground.rest;

import com.conceptandcoding.springbootplayground.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list of student
    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jon", "Da"));
        studentList.add(new Student("Kamla", "Haris"));
        studentList.add(new Student("Risi", "Sunk"));

        return studentList; // Jackson will convert List<Student> to JSON array
    }
}
