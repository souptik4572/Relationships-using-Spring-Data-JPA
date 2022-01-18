package com.all_relationships.relationships_springdatajpa.repository;

import com.all_relationships.relationships_springdatajpa.entity.Course;
import com.all_relationships.relationships_springdatajpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial() {
        Course course = Course.builder()
                .title("Data Structures and Algorithms")
                .credit(10)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("course_url")
                .course(course)
                .build();
        courseMaterialRepository.save(courseMaterial);
    }
}