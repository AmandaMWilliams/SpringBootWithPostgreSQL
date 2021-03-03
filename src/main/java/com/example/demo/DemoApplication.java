package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping
	public List<Student> hello(){
		List studentList = new ArrayList();
		Student amanda = new Student(
				1L,
				"Amanda",
				"amanda@github.com",
				LocalDate.of(1988, Month.DECEMBER, 19),
				32
		);
		studentList.add(amanda);
		return studentList;
	}
}
