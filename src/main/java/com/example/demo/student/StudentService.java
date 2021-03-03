package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

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
