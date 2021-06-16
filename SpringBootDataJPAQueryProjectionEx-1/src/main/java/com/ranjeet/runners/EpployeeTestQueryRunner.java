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
		System.out.println("*************************Get All Employee Records**********************************");
		repo.fetchAllEmployeeProjection().forEach(System.out::println);
		System.out.println("******************************* Get All Employeee Name And Id");
		repo.getAllEmployeeNameAndId().stream().map(m->m[0]+"/"+m[1]).
		forEach(System.out::println);
		System.out.println("*********************************Get  Employee  Name By Their Id********************");
	    String empName =	repo.getEmployeeNameById(10);
	    System.out.println("Employee Name::"+empName);
	    System.out.println("******************* Get All Employee Name*********************** ");
	    repo.getAllEmployeeName().forEach(System.out::println);
	
		
	}

}
