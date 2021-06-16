package com.example.repositry;

import org.springframework.data.repository.CrudRepository;

import com.example.model.EmployeeDetails;

public interface EmployeeRepo extends CrudRepository<EmployeeDetails, Integer> {

}
