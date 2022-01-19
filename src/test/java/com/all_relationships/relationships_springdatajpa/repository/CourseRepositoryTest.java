package com.all_relationships.relationships_springdatajpa.repository;

import com.all_relationships.relationships_springdatajpa.entity.Course;
import com.all_relationships.relationships_springdatajpa.entity.CourseMaterial;
import com.all_relationships.relationships_springdatajpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveCourse() {
        CourseMaterial taijutsuCourseMaterial = CourseMaterial.builder()
                .url("taijutsu_course_url")
                .build();
        Course taijutsuCourse = Course.builder()
                .title("TaiJutsu")
                .credit(9)
                .courseMaterial(taijutsuCourseMaterial)
                .build();
        courseRepository.save(taijutsuCourse);
    }

    @Test
    public void printCourses() {
        List<Course> allCourses = courseRepository.findAll();
        System.out.println(allCourses);
    }

    @Test
    public void saveCourseWithTeacher() {
        Teacher sageArtJutsuTeacher = Teacher.builder()
                .firstName("Jiraiya")
                .lastName("Sage")
                .build();
        CourseMaterial sageArtJutsuCourseMaterial = CourseMaterial.builder()
                .url("sage_art_jutsu_course_url")
                .build();
        Course sageArtJutsuCourse = Course.builder()
                .title("Sage Art Jutsu")
                .credit(12)
                .courseMaterial(sageArtJutsuCourseMaterial)
                .teacher(sageArtJutsuTeacher)
                .build();
        courseRepository.save(sageArtJutsuCourse);
    }
}