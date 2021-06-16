package com.ranjeet.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class EmployeeColl {
	
	@Id
	@Column(name="eId")
	private Integer empId;
	@Column(name="eName")
	private String empName;
	@Column(name="eSal")
	private Double empSal;
	
	
	@ElementCollection
	@CollectionTable(name="empPrjs",
	joinColumns = @JoinColumn(name="eId"))
	@Column(name="prj")//element column
	@OrderColumn(name="pos")//index column
	private List<String> empPrjs;
	
	@ElementCollection
	@CollectionTable(name="empTaskTab",joinColumns = @JoinColumn(name="eId"))
	@Column(name="Task")
	private Set<String> empTask;
	
	@ElementCollection
	@CollectionTable(name="empModuleTab",joinColumns = @JoinColumn(name="eId"))
	@Column(name="module")
	@MapKeyColumn(name="pos")
	private Map<Integer,String> empModule;

}
