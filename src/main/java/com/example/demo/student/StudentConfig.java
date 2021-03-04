package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        ArrayList studentList = new ArrayList();
        return args -> {
            Student amanda = new Student(
                    "Amanda",
                    "amanda@github.com",
                    LocalDate.of(1988, Month.DECEMBER, 19)
            );
            Student christine = new Student(
                    "Christine",
                    "christine@github.com",
                    LocalDate.of(1991, Month.JULY, 4)
            );
            studentList.add(amanda);
            studentList.add(christine);
            repository.saveAll(studentList);
        };
    }
}
