package com._EBCS043.BDASGA2.service.impl;

import org.springframework.stereotype.Service;
import com._EBCS043.BDASGA2.model.Student;
import com._EBCS043.BDASGA2.repo.StudentRepo;
import com._EBCS043.BDASGA2.service.StudentService;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repo;

    public StudentServiceImpl(StudentRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Student> findAll() {
        return repo.findAll();
    }

    @Override
    public Student save(Student s) {
        return repo.save(s);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Student> findByCourseId(Long courseId) {
        return repo.findStudentsByCourse(courseId);
    }
}