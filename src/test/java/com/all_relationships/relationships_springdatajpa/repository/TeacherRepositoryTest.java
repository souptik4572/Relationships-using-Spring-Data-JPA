package com.all_relationships.relationships_springdatajpa.repository;

import java.util.List;

import com.all_relationships.relationships_springdatajpa.entity.Course;
import com.all_relationships.relationships_springdatajpa.entity.CourseMaterial;
import com.all_relationships.relationships_springdatajpa.entity.Teacher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

//    @Test
//    public void saveTeacher() {
//        CourseMaterial ninJutsuCourseMaterial = CourseMaterial.builder()
//                .url("ninjutsu_course_url")
//                .build();
//        Course ninJutsuCourse = Course.builder()
//                .title("NinJutsu")
//                .credit(10)
//                .courseMaterial(ninJutsuCourseMaterial)
//                .build();
//        CourseMaterial genJutsuCourseMaterial = CourseMaterial.builder()
//                .url("genjutsu_course_url")
//                .build();
//        Course genJutsuCourse = Course.builder()
//                .title("GenJutsu")
//                .credit(10)
//                .courseMaterial(genJutsuCourseMaterial)
//                .build();
//        Teacher teacher = Teacher.builder()
//                .firstName("Kakashi")
//                .lastName("Hatake")
//                .(List.of(ninJutsuCourse, genJutsuCourse))
//                .build();
//        teacherRepository.save(teacher);
//    }
}
