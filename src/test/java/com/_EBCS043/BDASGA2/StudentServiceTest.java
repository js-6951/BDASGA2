package com._EBCS043.BDASGA2;

import com._EBCS043.BDASGA2.model.Student;
import com._EBCS043.BDASGA2.repo.StudentRepo;
import com._EBCS043.BDASGA2.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentServiceTest {

    @Test
    void findAllReturnsList() {
        StudentRepo repo = Mockito.mock(StudentRepo.class);
        Mockito.when(repo.findAll()).thenReturn(List.of(new Student()));
        StudentServiceImpl s = new StudentServiceImpl(repo);
        var out = s.findAll();
        assertThat(out).hasSize(1);
    }
}
