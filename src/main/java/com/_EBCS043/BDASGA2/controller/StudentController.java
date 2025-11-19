package com._EBCS043.BDASGA2.controller;

import com._EBCS043.BDASGA2.model.*;
import com._EBCS043.BDASGA2.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;
    private final CourseService courseService;

    public StudentController(StudentService studentService,
            CourseService courseService) {
        this.studentService = studentService;
        this.courseService = courseService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("students", studentService.findAll());
        model.addAttribute("courses", courseService.findAll());
        return "students";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseService.findAll());
        return "add-student";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Student student, @RequestParam(required = false) Long courseId) {
        if (courseId != null) {
            Course c = courseService.findById(courseId).orElse(null);
            student.setCourse(c);
        }
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Student s = studentService.findById(id).orElseThrow();
        model.addAttribute("student", s);
        model.addAttribute("courses", courseService.findAll());
        return "update-student";
    }

    @PostMapping("/edit/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Student student,
            @RequestParam(required = false) Long courseId) {
        student.setId(id);
        if (courseId != null) {
            Course c = courseService.findById(courseId).orElse(null);
            student.setCourse(c);
        } else {
            student.setCourse(null);
        }
        studentService.save(student);
        return "redirect:/students";
    }
}