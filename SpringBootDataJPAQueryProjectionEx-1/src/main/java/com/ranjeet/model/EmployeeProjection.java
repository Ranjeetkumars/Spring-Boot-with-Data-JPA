package com.ranjeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmployeeProjection {
	
	@Id
	private Integer Id;
	private String empName;
	private Integer empSal;
	private String empDept;

}