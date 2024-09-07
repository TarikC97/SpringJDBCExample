package com.tarikcuric.SpringJDBCExample.repository;

import com.tarikcuric.SpringJDBCExample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private JdbcTemplate jdbc;

    public void save(Student student) {

        String query = " insert into student(number, name, marks) values(?,?,?)";
        int rows = jdbc.update(query, student.getNumber(), student.getName(), student.getMarks());
        System.out.println(rows + "affected");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
