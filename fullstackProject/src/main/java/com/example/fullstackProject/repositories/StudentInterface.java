package com.example.fullstackProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackProject.model.Student;

public interface StudentInterface extends JpaRepository<Student,Integer> {

}
