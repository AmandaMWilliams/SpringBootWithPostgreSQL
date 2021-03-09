package com.example.demo;

import com.example.demo.student.Student;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

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
        //when
        //then
    }

    @Test
    public void constructorNoIDTest(){
        //given
        //when
        //then
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
