package com.ranjeet.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.EmployeeProjection;
import com.ranjeet.repo.EmployeeRepo;

//@Component
public class EmployeeInsertRunner implements CommandLineRunner {

	
	@Autowired
    EmployeeRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new EmployeeProjection(10,"SAM", 5800, "DEV"));
		repo.save(new EmployeeProjection(11,"ABC", 7800, "DEV"));
		repo.save(new EmployeeProjection(12,"XYZ", 9800, "DEV"));
		repo.save(new EmployeeProjection(13,"PQR", 85800, "DEV"));
		repo.save(new EmployeeProjection(14,"SMR", 10800, "DEV"));
		repo.save(new EmployeeProjection(15,"KLM", 5800, "DEV"));
		repo.save(new EmployeeProjection(16,"LT", 15800, "DEV"));
		repo.save(new EmployeeProjection(17,"LOUR", 15800, "DEV"));
		repo.save(new EmployeeProjection(18,"PAI", 25800, "DEV"));
		
	}
	

}
