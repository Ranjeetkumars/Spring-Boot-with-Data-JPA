package com.ranjeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
