package com.example.lab_task_six;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/students")
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Service studentService;

    @GetMapping("/student-form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/save-student")
    public String saveStudent(@ModelAttribute Student student, Model model) {
        try {
            Student savedStudent = studentService.saveStudent(student);
            model.addAttribute("message", "Student saved successfully with ID: " + savedStudent.getId());
        } catch (Exception e) {
            model.addAttribute("message", "Failed to save student: " + e.getMessage());
        }
        return "result";
    }
}
