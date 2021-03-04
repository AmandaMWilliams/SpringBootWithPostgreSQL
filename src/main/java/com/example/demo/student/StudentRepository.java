package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // responsible for the data access between the service layer
// and postgres DB
public interface StudentRepository extends JpaRepository<Student, Long> {

}
