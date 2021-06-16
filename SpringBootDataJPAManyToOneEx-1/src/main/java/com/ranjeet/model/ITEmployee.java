package com.ranjeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ITEmployee {
	
	
	@Id
	private Integer id;
	private String empName;
	private Double empSal;
	@ManyToOne
	@JoinColumn(name="department")
	private Department depart; 
	

}
