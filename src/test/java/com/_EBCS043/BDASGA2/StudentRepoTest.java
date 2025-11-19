package com._EBCS043.BDASGA2;

import com._EBCS043.BDASGA2.model.Course;
import com._EBCS043.BDASGA2.model.Student;
import com._EBCS043.BDASGA2.repo.CourseRepo;
import com._EBCS043.BDASGA2.repo.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepoTest {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    CourseRepo courseRepo;

    @Test
    void testFindStudentsByCourse() {
        Course c = new Course();
        c.setName("TestCourse");
        c.setInstructor("Inst");
        courseRepo.save(c);

        Student s = new Student();
        s.setFullName("Alice");
        s.setAge(20);
        s.setCourse(c);
        studentRepo.save(s);

        var list = studentRepo.findStudentsByCourse(c.getId());
        assertThat(list).isNotEmpty();
        assertThat(list.get(0).getFullName()).isEqualTo("Alice");
    }
}