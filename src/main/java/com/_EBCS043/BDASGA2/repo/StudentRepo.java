package com._EBCS043.BDASGA2.repo;

import com._EBCS043.BDASGA2.model.Student;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {

    // Custom join
    @Query("""
            SELECT s FROM Student s
            INNER JOIN s.course c
            WHERE c.id = :courseId
            """)
    List<Student> findStudentsByCourse(@Param("courseId") Long courseId);
}