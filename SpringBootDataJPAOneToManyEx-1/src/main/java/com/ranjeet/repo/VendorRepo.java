package com.ranjeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer> {

}
