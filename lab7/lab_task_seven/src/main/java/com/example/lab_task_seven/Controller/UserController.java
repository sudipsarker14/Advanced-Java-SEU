package com.example.lab_task_seven.Controller;

import com.example.lab_task_seven.DTO.LoginRequest;
import com.example.lab_task_seven.DTO.LoginResponse;
import com.example.lab_task_seven.Entity.Student;
import com.example.lab_task_seven.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        boolean success = userService.validateUser(request.getUsername(), request.getPassword());
        if (success) {
            return ResponseEntity.ok(new LoginResponse(true, "Login successful"));
        } else {
            return ResponseEntity.status(401).body(new LoginResponse(false, "Invalid credentials"));
        }
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(userService.getAllStudents());
    }
}
