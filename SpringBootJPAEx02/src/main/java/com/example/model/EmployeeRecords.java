package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee_Records_Pagination")
public class EmployeeRecords {
	
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSalary;

}
