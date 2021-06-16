package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.model.Student;
@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer>{

}
