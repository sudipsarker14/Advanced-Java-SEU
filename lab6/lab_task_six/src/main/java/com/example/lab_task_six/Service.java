package com.example.lab_task_six;


import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
