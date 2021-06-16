package com.ranjeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.model.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Integer> {

}
