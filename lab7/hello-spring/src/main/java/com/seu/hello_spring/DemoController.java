package com.seu.hello_spring;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/demo-rest/hello?name=ABC";

        Response response = restTemplate.getForObject(url, Response.class);

        System.out.println("response --> " + response);

        return "hello";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(username, password);

        LoginHandler handler = new LoginHandler();
        handler.setUser(user);

        Response response = handler.handleLogin();
        System.out.println("response --> " + response);
       /* System.out.println("username --> " + username);

        request.setAttribute("user", user);
        request.setAttribute("login", true);*/

        String page = "hello";

        if(response.getCode().equals("0")) {
            page = "home";
        }

        return page;
    }

}
