package com.example.my_lms_app.repository;

import com.example.my_lms_app.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    public String findCourseById(Long id);

    public String findCourseByTitle(String title);

}
