package com.example.demo.models;

import jakarta.persistence.Entity;

@Entity//to tell springboot that these are not normal classes, these should be persisted in DB in separate table
public class Exam extends BaseModel{
    private String name;
    private int duration;

}
