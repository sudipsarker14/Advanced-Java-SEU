package com.example.demofinal;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the provided username and password match the static credentials
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            // If login is successful, redirect to the home page
            response.sendRedirect("home");
        } else {
            // If login fails, redirect back to the login page with an error message
            request.setAttribute("error", "Invalid username or password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }
    }
}
