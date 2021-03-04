package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controllers contain all the resources for the API
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController { // API/Controller layer is responsible
    // for CRUD operations.

    private final StudentService studentService;

    @Autowired // magically instantiates the studentService on line 15
    // and injects it into this constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
