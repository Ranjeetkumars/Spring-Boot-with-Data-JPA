package com.ranjeet.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.repo.EmployeeRepo;
@Component
public class EpployeeTestQueryRunner implements CommandLineRunner {

	
	@Autowired
	EmployeeRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		//repo.getAllProEmployee().forEach(System.out::println);
		//repo.getAllProEmployeeByDept("DEV").forEach(System.out::println);
		//repo.getAllProEmployeeByDeptAndId("DEV",10).forEach(System.out::println);
		
		
		//repo.getAllProEmployeeByIdBetWeen(10, 15).forEach(System.out::println);
		
		
		//repo.getAllProEmployeeBYSQLPureQuery().forEach(System.out::println);
		
		
		//repo.getAllProEmployeeByIdBetWeeninfo(10, 15).forEach(System.out::println);
		
		repo.getAllProEmployeeById(Arrays.asList(10,11,12,13,17)).forEach(System.out::println);
	}

}
