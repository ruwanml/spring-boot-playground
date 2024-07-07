package com.conceptandcoding.springbootplayground.rest;

import com.conceptandcoding.springbootplayground.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> studentList;

    // define @PostConstruct to load the student data ... only once!
    @PostConstruct
    public void loadData() {
        studentList = new ArrayList<>();

        studentList.add(new Student("Jon", "Da"));
        studentList.add(new Student("Kamla", "Haris"));
        studentList.add(new Student("Risi", "Sunk"));
    }

    // define endpoint for "/students" - return a list of student

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList; // Jackson will convert List<Student> to JSON array
    }

    // define endpoint for "/students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // check the studentId against list size

        if (studentId < 0 || studentId >= studentList.size()) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return studentList.get(studentId);
    }
}
