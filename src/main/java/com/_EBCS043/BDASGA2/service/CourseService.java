package com._EBCS043.BDASGA2.service;

import com._EBCS043.BDASGA2.model.Course;
import java.util.List;
import java.util.Optional;

public interface CourseService {

    Course getCourseById(Long id);

    List<Course> findAll();

    Course save(Course c);

    Optional<Course> findById(Long id);
}