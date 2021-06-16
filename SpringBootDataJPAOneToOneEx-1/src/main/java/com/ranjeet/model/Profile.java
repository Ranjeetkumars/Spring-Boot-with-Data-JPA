package com.ranjeet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Profile {
	
	@Id
	private Integer id;
	private String idType;
	private String idNo;

}
