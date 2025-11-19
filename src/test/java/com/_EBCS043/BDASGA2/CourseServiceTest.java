package com._EBCS043.BDASGA2;

import com._EBCS043.BDASGA2.model.Course;
import com._EBCS043.BDASGA2.repo.CourseRepo;
import com._EBCS043.BDASGA2.service.impl.CourseServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CourseServiceTest {

    @Mock
    private CourseRepo courseRepo;

    @InjectMocks
    private CourseServiceImpl courseService;

    public CourseServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetCourseById() {
        Course c = new Course();
        c.setId(1L);
        c.setName("History");
        c.setInstructor("Prof. Lane");

        when(courseRepo.findById(1L)).thenReturn(Optional.of(c));

        Course result = courseService.getCourseById(1L);

        assertNotNull(result);
        assertEquals("History", result.getName());
    }
}