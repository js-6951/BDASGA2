package com._EBCS043.BDASGA2.service.impl;

import org.springframework.stereotype.Service;
import com._EBCS043.BDASGA2.model.Course;
import com._EBCS043.BDASGA2.repo.CourseRepo;
import com._EBCS043.BDASGA2.service.CourseService;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo repo;

    public CourseServiceImpl(CourseRepo repo) {
        this.repo = repo;
    }

    @Override
    public Course getCourseById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Course> findAll() {
        return repo.findAll();
    }

    @Override
    public Course save(Course c) {
        return repo.save(c);
    }

    @Override
    public Optional<Course> findById(Long id) {
        return repo.findById(id);
    }
}