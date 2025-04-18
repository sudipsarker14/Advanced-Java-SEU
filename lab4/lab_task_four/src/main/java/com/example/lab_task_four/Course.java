package com.example.lab_task_four;


public class Course {
    private int id;
    private String courseName;
    private String courseCode;

    public Course(int id, String courseName, String courseCode) {
        this.id = id;
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
