package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

@Entity//to tell springboot that these are not normal classes, these should be persisted in DB in separate table
//we are creating classes for every relationship
public class StudentCourseExam extends BaseModel{
    @ManyToOne
    private Student student;

    @ManyToOne
    private  ExamCourse examCourse;

    private int marks;
    //writing attributes of relationships


}
