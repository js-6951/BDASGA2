package com._EBCS043.BDASGA2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String instructor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Student> students;
}