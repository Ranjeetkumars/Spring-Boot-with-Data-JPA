package com.ranjeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "College_Records")
public class CollegeRecords {
	
	@Id
	private Integer cId;
	private String cName;
	private String cAddress;
	

}
