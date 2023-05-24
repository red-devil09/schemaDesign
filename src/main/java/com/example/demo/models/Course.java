package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity//to tell springboot that these are not normal classes, these should be persisted in DB in separate table
public class Course extends BaseModel{
    private String name;

    @ManyToMany(mappedBy = "enrolledCourses")
    //as this many to many reln is same as written in student side, so we don;t want to create a separate table for this
    //and want to refer to that table only which is created on Student side
    private List<Student> enrolledStudents;
}
