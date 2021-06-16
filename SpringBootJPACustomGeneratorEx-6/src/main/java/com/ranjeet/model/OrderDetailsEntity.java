package com.ranjeet.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDR_DTLS")
public class OrderDetailsEntity {

	@Id
	@Column(name = "ORDER_ID")
	private Integer orderId;

	@Column(name = "ORDER_PRDCT_NAME")
	private String orderProductName;
	
	@Column(name = "ORDER_BY")
	private String orderBy;
	
	@Column(name = "ORDER_PLACED_DT")
	@Temporal(TemporalType.DATE)
	private Date orderPlacedDate;
}
