package com.ranjeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Department {
	
	@Id
	private Integer id;
	private String deptCode;
	private String deptName;

}
