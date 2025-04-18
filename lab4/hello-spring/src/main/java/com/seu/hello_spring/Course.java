package com.seu.hello_spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String courseCode;
    private String courseName;
    private int section;

    public Course(String courseCode) {
        this.courseCode = courseCode;
    }

}
