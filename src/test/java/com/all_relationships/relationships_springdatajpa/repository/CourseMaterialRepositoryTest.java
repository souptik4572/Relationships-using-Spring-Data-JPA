package com.all_relationships.relationships_springdatajpa.repository;

import com.all_relationships.relationships_springdatajpa.entity.Course;
import com.all_relationships.relationships_springdatajpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial() {
        Course taijutsuCourse = Course.builder()
                .title("TaiJutsu")
                .credit(9)
                .build();
        CourseMaterial taijutsuCourseMaterial = CourseMaterial.builder()
                .url("taijutsu_course_url")
                .course(taijutsuCourse)
                .build();
        courseMaterialRepository.save(taijutsuCourseMaterial);
    }

    @Test
    public void printAllCourseMaterials() {
        List<CourseMaterial> allCourseMaterials = courseMaterialRepository.findAll();
        System.out.println("All Course Materials" + allCourseMaterials);
    }
}