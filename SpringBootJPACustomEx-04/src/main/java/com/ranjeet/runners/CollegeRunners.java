package com.ranjeet.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.CollegeRecords;
import com.ranjeet.repo.CollegeRepo;

@Component
public class CollegeRunners implements CommandLineRunner {

	@Autowired
	CollegeRepo repo;

	@Override
	public void run(String... args) throws Exception {

		
//
//		repo.saveAll(Arrays.asList(
//				new CollegeRecords(1,"Tit","bhopal"),
//				new CollegeRecords(2,"nit","patna"),
//				new CollegeRecords(3,"Bit","bihar"),
//				new CollegeRecords(4,"IIT","India")
//				));
		repo.findBycName("Tit").forEach(System.out::println);

	}

}
