package com.example.lab_task_five;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class Controller {

    private final String VALID_USERNAME = "admin";
    private final String VALID_PASSWORD = "password123";

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Users request) {
        if (VALID_USERNAME.equals(request.getUsername()) &&
                VALID_PASSWORD.equals(request.getPassword())) {
            return ResponseEntity.ok().body("Login successful!");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }

}
