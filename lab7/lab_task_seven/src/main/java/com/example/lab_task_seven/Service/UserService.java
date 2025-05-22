package com.example.lab_task_seven.Service;

import com.example.lab_task_seven.Entity.Student;
import com.example.lab_task_seven.Entity.User;
import com.example.lab_task_seven.Repository.UserRepository;
import com.example.lab_task_seven.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    public boolean validateUser(String username, String password) {
        Optional<User> user = userRepository.findByUsernameAndPassword(username, password);
        return user.isPresent();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
