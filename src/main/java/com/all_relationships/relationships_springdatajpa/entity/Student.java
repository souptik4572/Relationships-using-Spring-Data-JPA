package com.all_relationships.relationships_springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String gaurdianName;
    private String gaurdianEmail;
    private String gaurdianMobile;
}
