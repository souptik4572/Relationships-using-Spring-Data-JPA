package com.all_relationships.relationships_springdatajpa.repository;

import com.all_relationships.relationships_springdatajpa.entity.Guardian;
import com.all_relationships.relationships_springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("souptiksarkar4572@gmail.com")
                .firstName("Souptik")
                .lastName("Sarkar")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
                .name("Kizashi Haruno")
                .email("harunokizashi@gmail.com")
                .mobile("7563857390")
                .build();
        Student student = Student.builder()
                .firstName("Sakura")
                .lastName("Haruno")
                .emailId("harunosakura@gmail.com")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList.toString());
    }

    @Test
    public void getAllStudentsByFirstName() {
        List<Student> studentList = studentRepository.findAllByFirstName("Souptik");
        System.out.println(studentList.toString());
    }

    @Test
    public void getStudentsByFirstNameContaining() {
        List<Student> studentList = studentRepository.findByFirstNameContaining("ik");
        System.out.println(studentList.toString());
    }

    @Test
    public void getStudentsByGuardianName() {
        List<Student> studentList = studentRepository.findByGuardianName("Tapas Sarkar");
        System.out.println(studentList.toString());
    }
}