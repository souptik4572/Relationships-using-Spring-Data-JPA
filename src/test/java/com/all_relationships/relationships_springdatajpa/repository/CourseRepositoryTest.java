package com.all_relationships.relationships_springdatajpa.repository;

import com.all_relationships.relationships_springdatajpa.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses() {
        List<Course> allCourses = courseRepository.findAll();
        System.out.println(allCourses.toString());
    }
}