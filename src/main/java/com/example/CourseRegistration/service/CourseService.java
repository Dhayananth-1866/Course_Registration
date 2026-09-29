package com.example.CourseRegistration.service;


import com.example.CourseRegistration.model.CourseReg;
import com.example.CourseRegistration.model.Courses;
import com.example.CourseRegistration.repository.CourseRegRepo;
import com.example.CourseRegistration.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService  {
    @Autowired
     CourseRepo courseRepo;
    @Autowired
    CourseRegRepo courseRegRepo;

    public List<Courses> getAllCourses() {
    return courseRepo.findAll();
    }

    public List<CourseReg> getEnrolledStudents() {
        return courseRegRepo.findAll();
    }

    public void enrollStudent(String name, String emailId, String courseName) {

        CourseReg coursereg=new CourseReg(name,emailId,courseName);
        courseRegRepo.save(coursereg);
    }
}
