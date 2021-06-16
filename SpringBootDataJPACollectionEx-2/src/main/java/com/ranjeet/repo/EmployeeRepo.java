package com.ranjeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.EmployeeColl;

public interface EmployeeRepo extends JpaRepository<EmployeeColl, Integer> {

}
