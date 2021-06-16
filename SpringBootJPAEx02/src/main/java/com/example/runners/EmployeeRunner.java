package com.example.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.example.model.EmployeeRecords;
import com.example.repo.EmployeeRepo;
@Component
public class EmployeeRunner implements CommandLineRunner {

	
	@Autowired
	EmployeeRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		 
		
		EmployeeRecords emp = new EmployeeRecords();
		
		emp.setEmpName("Ranjeet");
		emp.setEmpSalary(10000000.0);
		List<EmployeeRecords> ls = new ArrayList<>();
		ls.add(new EmployeeRecords(1,"Ranjeet",18000.0));
		ls.add(new EmployeeRecords(2,"Purus",18000.0));
		ls.add(new EmployeeRecords(3,"Habiboon",18000.0));
		ls.add(new EmployeeRecords(4,"Priya",18000.0));
		ls.add(new EmployeeRecords(5,"Usha",15000.0));
		ls.add(new EmployeeRecords(6,"Swapna",15000.0));
		ls.add(new EmployeeRecords(7,"krishna",15000.0));
		ls.add(new EmployeeRecords(8,"Sindhu",15000.0));
		ls.add(new EmployeeRecords(9,"Sai Teja",15000.0));
		ls.add(new EmployeeRecords(10,"Rajesh",15000.0));
		
		System.out.println("**********************SAVE IN DB***********************");
		repo.saveAll(ls);
		
		System.out.println("****************************Sort by Name***************");
	   Sort s = Sort.by(Direction.DESC,"empName");
	   List<EmployeeRecords> listOfEmp = (List<EmployeeRecords>) repo.findAll(s);
	   listOfEmp.forEach(System.out::println);
	   
	   System.out.println("***************** USE PAGINATION WITH SPRING BOOT ***********************");
	   //Prepare pagination input (number, size)
	   Pageable input = PageRequest.of(2, 4);
	  Page<EmployeeRecords> empPage = repo.findAll(input);
	  List<EmployeeRecords> listOfEmp1 = empPage.getContent();
	  listOfEmp1.forEach(System.out::println);
	  
		

	}

}
