package com.ranjeet.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.Department;
import com.ranjeet.model.ITEmployee;

@Component
public class TestRunners  implements CommandLineRunner{

	@Autowired
	DepartmentRepo repo1;
	
	@Autowired
	EmployeeRepo repo2;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Department d = new Department(137, "DEVELOPMENT" , "DEV");
		repo1.save(d);
		ITEmployee ite = new ITEmployee(1,"Ranjeet kumar", 18000.0 ,d);
		ITEmployee ite1 = new ITEmployee(2,"purus kumar", 18000.0 ,d);
		
		repo2.save(ite);
		repo2.save(ite1);
		
		
		
	}

}
