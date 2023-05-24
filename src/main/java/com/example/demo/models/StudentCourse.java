//package com.example.demo.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.ManyToOne;
//
//@Entity//to tell springboot that these are not normal classes, these should be persisted in DB in separate table
////we are creating classes for every relationship
//
//public class StudentCourse extends BaseModel{
//    //now this class makes no sense as it does not have any attribute, so we plan to delete it
//    //but if we delete this, we have to take care of this relationship between classes{relation betwen student and module{
//    //hence we store this relation in Student class, and delete this class;
//
//    @ManyToOne
//    private Student student;
//
//    @ManyToOne
//    private Course course;
//}
