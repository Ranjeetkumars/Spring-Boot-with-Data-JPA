package com.ranjeet.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProEmployee {
	
	@Id
	private Integer Id;
	private String empName;
	private Integer empSal;
	private String empDept;

}
