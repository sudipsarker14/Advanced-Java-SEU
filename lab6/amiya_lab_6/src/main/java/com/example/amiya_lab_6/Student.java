
package com.example.amiya_lab_6;



public class Student {

    @Gett
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String mobile;

    // Getters and Setters
}