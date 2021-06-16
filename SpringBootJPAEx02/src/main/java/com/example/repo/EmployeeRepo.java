package com.example.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.EmployeeRecords;

public interface EmployeeRepo extends PagingAndSortingRepository<EmployeeRecords, Integer> {

}
