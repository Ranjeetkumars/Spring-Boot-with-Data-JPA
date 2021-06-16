package com.ranjeet.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.Contract;
import com.ranjeet.model.Vendor;
import com.ranjeet.repo.ContractRepo;
import com.ranjeet.repo.VendorRepo;

@Component
public class Runners implements CommandLineRunner {

	@Autowired
	ContractRepo repo;
	
	@Autowired
	VendorRepo repo1;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		List<Contract> listContract = new ArrayList<Contract>();
		listContract.add( new Contract(1,"Sotware Support",1000000.0,"108"));
		listContract.add( new Contract(2,"Sotware Support",1000000.0,"104"));
		listContract.add( new Contract(3,"Sotware Support",1000000.0,"102"));
		listContract.add( new Contract(4,"Sotware Support",1000000.0,"107"));
		
		repo.saveAll(listContract);
		
		Vendor v = new Vendor(1,"Ranjeet","Lakhisaray,Jehanabad bihar 804427",listContract);
		
		repo1.save(v);
		
	}

}
