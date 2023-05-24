package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity//to tell springboot that these are not normal classes, these should be persisted in DB in separate table
public class Student extends BaseModel{
    private String name;

    @ManyToMany
    private List<Course> enrolledCourses;
    //springboot will now itself create the mapping_class
}
