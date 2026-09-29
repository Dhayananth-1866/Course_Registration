package com.example.CourseRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class CourseReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//no need to send data for id

    private String name;
    private String emailId;
    private String courseName;

    public CourseReg() {
    }

    public CourseReg(String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
        

    }
}
