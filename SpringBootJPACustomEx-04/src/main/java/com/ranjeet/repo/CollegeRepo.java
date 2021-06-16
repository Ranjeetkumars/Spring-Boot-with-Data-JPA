package com.ranjeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.CollegeRecords;

public interface CollegeRepo extends JpaRepository<CollegeRecords, Integer> {
	
	
	List<CollegeRecords> findBycName(String cName);
	
	
	
	

}
