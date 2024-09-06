package com.tarikcuric.SpringJDBCExample.repository;

import com.tarikcuric.SpringJDBCExample.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(Student student) {
        System.out.println("Added");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
