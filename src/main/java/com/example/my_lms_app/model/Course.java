package com.example.my_lms_app.model;

import java.util.List;

public class Course {
    private Long id;
    private String title;
    private String description;
    private User instructor;
    private List<User> students;
}
