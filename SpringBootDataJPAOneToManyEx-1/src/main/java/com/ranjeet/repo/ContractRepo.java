package com.ranjeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.Contract;

public interface ContractRepo extends JpaRepository<Contract, Integer> {

}
