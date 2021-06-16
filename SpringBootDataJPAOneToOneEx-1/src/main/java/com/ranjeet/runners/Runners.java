package com.ranjeet.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ranjeet.model.Person;
import com.ranjeet.model.Profile;
import com.ranjeet.repo.PersonRepo;
import com.ranjeet.repo.ProfileRepo;

@Component
public class Runners  implements CommandLineRunner{

	@Autowired
	ProfileRepo repo;
	
	@Autowired
	PersonRepo pRepo;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		Profile p1 = new Profile(1,"PAN Card","MNV11376");
		Profile p2 = new Profile(2,"PAN Card","MNV1136");
	
		repo.save(p1);
		repo.save(p2);
		
	  Person p = new Person(1,"804427","Ranjeet","Male",p1);
	  Person p3 = new Person(2,"804427","Ranjeet","Male",p2);
	
	  pRepo.save(p);
	  pRepo.save(p3);
	
	}

}
