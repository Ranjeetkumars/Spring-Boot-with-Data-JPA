package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Reuuners implements CommandLineRunner {

	@Autowired
	Demo d1;
	
	
	@Override
	public void run(String... args) throws Exception {
		d1.m1();
	}

}
