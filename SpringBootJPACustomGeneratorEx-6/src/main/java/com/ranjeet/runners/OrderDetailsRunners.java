package com.ranjeet.runners;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.OrderDetailsEntity;
import com.ranjeet.repo.OrderDetailsRepositry;

@Component
public class OrderDetailsRunners implements CommandLineRunner {

	@Autowired
	OrderDetailsRepositry repo;
	
	@Override
	public void run(String... args) throws Exception {
		Date orderDate = new Date(System.currentTimeMillis());
		repo.saveAll(Arrays.asList(
				new OrderDetailsEntity(1,"Ranjeet KUmar","iPhone",orderDate),
				new OrderDetailsEntity(2,"Golden KUmar","Samsung",orderDate),
		        new OrderDetailsEntity(3,"Amit KUmar","Mi",orderDate),
                new OrderDetailsEntity(4,"Bhuvan Patel","VIVO",orderDate),
                new OrderDetailsEntity(5,"Purushotam Akula","Micromax",orderDate),
                new OrderDetailsEntity(6,"Priya Senapati","Sony",orderDate)));
		
		//repo.findAllOrderBy().forEach(System.out::println);
		//repo.getOrderDetailsByName("Ranjeet KUmar").forEach(System.out::println);
		
		
		OrderDetailsEntity data =	repo.findByOrderBy("Ranjeet");
     System.out.println("@@@@@@@@@@@@@@@@@@@@@@@::"+data);
	}

}
