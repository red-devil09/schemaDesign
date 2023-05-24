package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity//to tell springboot that these are not normal classes, these should be persisted in DB in separate table
//we are creating classes for every relationship
public class ExamCourse extends BaseModel{

    //in classes we store the actual object, and in tables we store ID and ORM will do this(store ids in DB)
    @ManyToOne
    private Exam exam;

    @ManyToOne
    private Course course;

    private Date examDate;
}
//if type of an attribute of a class is a data type that is also being persisted
//=> we are talking about the relation between two classes here {Exam and Course are attributes}
//must specify cardinality of relationship so that spring can create tables appropriately
//now try to find relationship between ExamCourse and Exam
// ModuleExam  :  Module
// 1    :     1  (l to r) {just look at class above onlt one exam in Examcourse}
// M     :    1  (r to l) { ek exam to multiple courses mei ho skta h}



//behind the scenes
/*

    ExamCourse{
    Exam exam;  M:1
    Course course;    M:1
    }


    springboot will create table for every entity class


    //and for M:1 reln, to depict in table we put id of 1 side to M side
    //1 side is exam and M side is exam_courses
    //1 side in course and M side in exam_courses

    exam_courses
    exam_id  |   course_id





 */
