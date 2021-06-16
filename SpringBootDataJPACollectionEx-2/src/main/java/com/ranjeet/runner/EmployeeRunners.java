package com.ranjeet.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.EmployeeColl;
import com.ranjeet.repo.EmployeeRepo;

@Component
public class EmployeeRunners implements CommandLineRunner {

	@Autowired
	EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {

		EmployeeColl ec = new EmployeeColl(1, "Ranjeet", 18000.0, List.of("P1", "P2"), Set.of("T1", "T2"),
				Map.of(101, "M1",102, "M2"));
		
		repo.save(ec);

	}

}
