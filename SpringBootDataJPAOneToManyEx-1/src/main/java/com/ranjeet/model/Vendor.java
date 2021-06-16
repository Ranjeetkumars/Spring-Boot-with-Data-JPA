package com.ranjeet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Vendor {
	
	@Id
	private Integer id;
	private String vName;
	private String vAddress;
	
	@OneToMany
	@JoinColumn(name="contract_fk")
	private List<Contract> contract;

}
