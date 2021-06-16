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
public class Contract {
	
	@Id
	private Integer cid;
	private String code;
	private Double bidAmt;
	private String ctype;

}
