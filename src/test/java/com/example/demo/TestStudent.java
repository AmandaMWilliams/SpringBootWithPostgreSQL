package com.example.demo;

import com.example.demo.student.Student;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.Month;

public class TestStudent {

    @Test
    public void nullConstructorTest(){
        //given
        Student testStudent = new Student();
        //when
        //then
        Assert.notNull(testStudent);
    }

    @Test
    public void oLConstructorTest(){
        //given
        Student testStudent = new Student();
        Long testID = 123L;
        String testName = "Amanda";
        String testEmail = "amanda@code.com";
        LocalDate testDOB = LocalDate.of(1988, Month.DECEMBER, 19);
        //when
        testStudent.setId(testID);
        testStudent.setName(testName);
        testStudent.setEmail(testEmail);
        testStudent.setDob(testDOB);
        //then
        Assert.notNull(testStudent);
    }

    @Test
    public void constructorNoIDTest(){
        //given
        Student testStudent = new Student();
        String testName = "Amanda";
        String testEmail = "amanda@code.com";
        LocalDate testDOB = LocalDate.of(1988, Month.DECEMBER, 19);
        //when
        testStudent.setName(testName);
        testStudent.setEmail(testEmail);
        testStudent.setDob(testDOB);
        //then
        Assert.notNull(testStudent);
    }

    @Test
    public void getNameTest(){
        //given
        //when
        //then
    }

    @Test
    public void getEmailTest(){
        //given
        //when
        //then
    }

    @Test
    public void getAgeTest(){
        //given
        //when
        //then
    }

    @Test
    public void getDOBTest(){
        //given
        //when
        //then
    }
}
