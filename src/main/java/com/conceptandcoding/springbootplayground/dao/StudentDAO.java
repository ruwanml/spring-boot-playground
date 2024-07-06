package com.conceptandcoding.springbootplayground.dao;

import com.conceptandcoding.springbootplayground.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);
}
