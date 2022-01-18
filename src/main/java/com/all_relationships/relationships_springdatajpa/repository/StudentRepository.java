package com.all_relationships.relationships_springdatajpa.repository;

import com.all_relationships.relationships_springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String name);

    List<Student> findByLastNameNotNull();

    List<Student> findByGuardianName(String guardianName);

    Student findByFirstNameAndLastName(String firstName, String lastName);

    // JPQL query, based on the class that we have created
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAddress(String emailAddress);

    @Query("select concat(s.firstName, ' ', s.lastName) from Student s where " +
            "s.emailId = ?1")
    String getStudentNameByEmailAddress(String emailAddress);

    // Native SQL query
    @Query(
            value = "select * from table_student s where s.email_address = ?1",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNative(String emailAddress);

    @Query(
            value = "select concat(s.first_name, ' ', s.last_name) from " +
                    "table_student s where s.email_address = ?1",
            nativeQuery = true
    )
    String getStudentNameByEmailAddressNative(String emailAddress);

    // Native Named Param
    @Query(
            value = "select * from table_student s where s.email_address = " +
                    ":emailId",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emailAddress);
}
