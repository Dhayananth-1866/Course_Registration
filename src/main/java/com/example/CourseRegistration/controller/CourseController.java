package com.example.CourseRegistration.controller;


import com.example.CourseRegistration.model.CourseReg;
import com.example.CourseRegistration.model.Courses;
import com.example.CourseRegistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    List<Courses> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("courses/enrolled")
    List<CourseReg> getEnrolledStudents() {
        return courseService.getEnrolledStudents();
    }

    @PostMapping("courses/register")
    public String enrollStudent(@RequestParam("name") String name,
                                @RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName) {

        courseService.enrollStudent(name, emailId, courseName);
        return "Congratulation..! " + name + ", Enrollment for " + courseName + " is successfull";
    }
}