package com._EBCS043.BDASGA2;

import com._EBCS043.BDASGA2.model.Course;
import com._EBCS043.BDASGA2.repo.CourseRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CourseRepoTest {

    @Autowired
    private CourseRepo courseRepo;

    @Test
    void testSaveCourse() {
        Course c = new Course();
        c.setName("Physics");
        c.setInstructor("Dr. Stone");

        Course saved = courseRepo.save(c);

        assertNotNull(saved.getId());
        assertEquals("Physics", saved.getName());
    }
}