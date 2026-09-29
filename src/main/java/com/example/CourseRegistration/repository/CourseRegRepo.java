package com.example.CourseRegistration.repository;

import com.example.CourseRegistration.model.CourseReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegRepo extends JpaRepository<CourseReg,Integer> {
}
