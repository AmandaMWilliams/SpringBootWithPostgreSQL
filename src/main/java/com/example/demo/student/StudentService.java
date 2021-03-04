package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service // turns this class into a Bean (a class that has to be
// instantiated) so that it can be used in StudentController line 15
public class StudentService { //The service layer contains all the
    // business logic for managing the students. It talks to the
    // API/Controller layer

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
//
//        List studentList = new ArrayList();
//        Student amanda = new Student(
//                1L,
//                "Amanda",
//                "amanda@github.com",
//                LocalDate.of(1988, Month.DECEMBER, 19),
//                32
//        );
//        studentList.add(amanda);
//        return studentList;
    }
}
