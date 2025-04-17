package com.seu.hello_spring;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
//    private List<Course> courseList;
}
