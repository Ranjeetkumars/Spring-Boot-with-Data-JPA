package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.examples"})
public class SpringBootJpaEx02Application {

	
	
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context =	SpringApplication.run(SpringBootJpaEx02Application.class, args);
		System.out.println("@@@@@@@@@@@@@@@@"+context);
		//Demo d = context.getBean("demo",Demo.class);
		
		
	}
	
	
	
	public static void demo() {
		
		//d1.m1();
		
	}
	
	
	
	 

}
