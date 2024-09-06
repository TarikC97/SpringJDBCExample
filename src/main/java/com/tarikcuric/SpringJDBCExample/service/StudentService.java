package com.tarikcuric.SpringJDBCExample.service;

import com.tarikcuric.SpringJDBCExample.model.Student;
import com.tarikcuric.SpringJDBCExample.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    private StudentRepo repo;

    public void addStudent(Student student){
        repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
