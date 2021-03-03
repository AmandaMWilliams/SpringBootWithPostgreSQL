package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

// Controllers contain all the resources for the API
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
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
