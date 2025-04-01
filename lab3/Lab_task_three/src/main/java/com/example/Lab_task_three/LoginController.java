package com.example.Lab_task_three;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    // List of static registered users
    private List<User> users = new ArrayList<>();

    // List of courses to populate the table
    private List<Course> courses = new ArrayList<>();

    public LoginController() {
        // Adding some static courses
        courses.add(new Course("Mathematics", "MATH101"));
        courses.add(new Course("Physics", "PHY101"));
        courses.add(new Course("Chemistry", "CHEM101"));

        // Adding some static users
        users.add(new User("admin", "password"));
        users.add(new User("user", "password123"));
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(String username, String password, Model model) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                model.addAttribute("courses", courses);
                return "home"; // Redirect to home page after successful login
            }
        }
        return "login"; // Return to login page if login fails
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(String username, String password, Model model) {
        // Add new user
        users.add(new User(username, password));
        model.addAttribute("message", "User registered successfully!");
        return "login"; // Redirect to login after successful registration
    }
}