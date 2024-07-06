package com.conceptandcoding.springbootplayground.dao;

import com.conceptandcoding.springbootplayground.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);
}