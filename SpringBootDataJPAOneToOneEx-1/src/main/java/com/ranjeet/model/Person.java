package com.ranjeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Person {
	
	@Id
	private Integer id;
	private String pcode;
	private String lname;
	private String gender;
	
	@ManyToOne
	@JoinColumn(name="prob_fk", unique = true)
	private Profile prob;
	

}
