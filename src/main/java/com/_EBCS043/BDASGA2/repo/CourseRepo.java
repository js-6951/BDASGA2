package com._EBCS043.BDASGA2.repo;

import com._EBCS043.BDASGA2.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}