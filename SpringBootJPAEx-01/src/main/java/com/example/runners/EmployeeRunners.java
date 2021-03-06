package com.example.runners;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.EmployeeDetails;
import com.example.repositry.EmployeeRepo;

@Component
public class EmployeeRunners implements CommandLineRunner {

	@Autowired
	EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("******************** Store in DB***********************");
		ArrayList<EmployeeDetails> al = new ArrayList<EmployeeDetails>();
		al.add(new EmployeeDetails(10, "Ranjeet Kumar", 18000.0, "Capzemni"));
		al.add(new EmployeeDetails(5, "Golden Kumar", 28000.0, "TCS"));
		al.add(new EmployeeDetails(3, "purus Kumar", 38000.0, "Wipro"));
		al.add(new EmployeeDetails(4, "bhuvan Kumar", 15000.0, "IBM"));
		al.add(new EmployeeDetails(8, "manjeet Kumar", 16000.0, "CTS"));
		repo.saveAll(al);

		System.out.println("********************Rerive All Employee Records***********************");
		List<EmployeeDetails> empItr = (List<EmployeeDetails>) repo.findAll();
		System.out.println("************************Before Sorting by Salary**********************");
		empItr.forEach(System.out::println);
		System.out.println("***************Aftre Sorting By Salary**********************************");
		empItr.stream().filter(gtSal -> gtSal.getEmpSalary() >= 18000 && gtSal.getEmpSalary() < 38000)
				.sorted((s1, s2) -> s1.getEmpId().compareTo(s2.getEmpId())).forEach(System.out::println);

		// forEach(System.out::println);

	}

}
