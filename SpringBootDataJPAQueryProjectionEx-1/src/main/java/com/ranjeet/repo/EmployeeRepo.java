package com.ranjeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ranjeet.model.EmployeeProjection;

public interface EmployeeRepo extends JpaRepository<EmployeeProjection, Integer> {
	
	//Get All EmployeeProjection
	@Query("SELECT e FROM EmployeeProjection e ")
	public List<EmployeeProjection> fetchAllEmployeeProjection();
	
	
	//Get Employee Name by their Id
	@Query("SELECT empName from EmployeeProjection WHERE Id=:Id")
	public String getEmployeeNameById(Integer Id);
	
	
	//Get All Employee Name
	@Query("SELECT empName FROM EmployeeProjection")
	public List<String> getAllEmployeeName();
	
	
	//Get All Employee Name And Id
	@Query("SELECT Id , empName FROM EmployeeProjection")
	public List<Object[]> getAllEmployeeNameAndId();
	
	
	
	


}
