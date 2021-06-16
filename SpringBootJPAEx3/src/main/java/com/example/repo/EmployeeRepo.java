package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
