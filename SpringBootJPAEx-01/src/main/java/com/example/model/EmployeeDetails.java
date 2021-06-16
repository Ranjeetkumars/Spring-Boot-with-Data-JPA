package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetails {
	
	@Id
	@Column(name = "Employee_Id")
	private Integer empId;
	
	
	@Column(name="Employee_Name", length = 30)
	private String empName;
	
	@Column(name="Employee_Salary")
	private Double empSalary;
	
	@Column(name="Employer_Name", length = 50)
	private String employeerName;
	

}
