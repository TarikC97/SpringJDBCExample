package com.tarikcuric.SpringJDBCExample;

import com.tarikcuric.SpringJDBCExample.model.Student;
import com.tarikcuric.SpringJDBCExample.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExampleApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringJdbcExampleApplication.class, args);

		Student stud = context.getBean(Student.class);
		stud.setNumber(115);
		stud.setName("Tarik");
		stud.setMarks(713);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(stud);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
