package com._EBCS043.BDASGA2.service;

import com._EBCS043.BDASGA2.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();

    Student save(Student s);

    Optional<Student> findById(Long id);

    List<Student> findByCourseId(Long courseId);
}