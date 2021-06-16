package com.ranjeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.ITEmployee;

public interface EmployeeRepo  extends JpaRepository<ITEmployee, Integer>{

}
