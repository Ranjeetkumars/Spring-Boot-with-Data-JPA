package com.examples.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@javax.persistence.Id
	private Integer Id;
	private String stuName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	@Lob
	private byte[] stuPic;
	@Lob
	private char[] stuDesc;

}
