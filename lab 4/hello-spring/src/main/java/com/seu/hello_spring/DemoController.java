package com.seu.hello_spring;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(username, password, null);
//        user.setUsername(username);
//        user.setPassword(password);

        Course c1 = new Course("CSE351", "AJ", 3);

        request.setAttribute("user", user);
        request.setAttribute("login", true);

        return "home";
    }

}
