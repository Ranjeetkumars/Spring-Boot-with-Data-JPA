package com.ranjeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
