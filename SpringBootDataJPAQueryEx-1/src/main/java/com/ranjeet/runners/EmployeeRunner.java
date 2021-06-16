package com.ranjeet.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.ProEmployee;
import com.ranjeet.repo.EmployeeRepo;

//@Component
public class EmployeeRunner implements CommandLineRunner {

	
	@Autowired
    EmployeeRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new ProEmployee(10,"SAM", 5800, "DEV"));
		repo.save(new ProEmployee(11,"ABC", 7800, "DEV"));
		repo.save(new ProEmployee(12,"XYZ", 9800, "DEV"));
		repo.save(new ProEmployee(13,"PQR", 85800, "DEV"));
		repo.save(new ProEmployee(14,"SMR", 10800, "DEV"));
		repo.save(new ProEmployee(15,"KLM", 5800, "DEV"));
		repo.save(new ProEmployee(16,"LT", 15800, "DEV"));
		repo.save(new ProEmployee(17,"LOUR", 15800, "DEV"));
		repo.save(new ProEmployee(18,"PAI", 25800, "DEV"));
		
	}
	

}
