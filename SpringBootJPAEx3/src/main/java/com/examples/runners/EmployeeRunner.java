package com.examples.runners;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.example.repo.EmployeeRepo;
import com.examples.model.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {

		repo.saveAll(Arrays.asList(new Employee(1, "Ram", "DEV", 1000.0), new Employee(2, "Mohan", "QA", 11000.0),
				new Employee(3, "Sohan", "BA", 12000.0), new Employee(4, "Ganesh", "DEV", 13000.0),
				new Employee(5, "Manish", "DEV", 15000.0), new Employee(6, "Satish", "DEV", 15000.0),
				new Employee(7, "Vinay", "QA", 15000.0), new Employee(8, "Ajay", "BA", 15000.0)));
//	}

		Employee emp = new Employee();
		emp.setEmpSalary(15000.0);
		emp.setEmpDept("DEV");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Example<Employee> ex = Example.of(emp);
		repo.findAll(ex).forEach(System.out::println);
	}
}
