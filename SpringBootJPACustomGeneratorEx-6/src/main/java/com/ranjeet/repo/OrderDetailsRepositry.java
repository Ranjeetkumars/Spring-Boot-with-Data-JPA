package com.ranjeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ranjeet.model.OrderDetailsEntity;

public interface OrderDetailsRepositry extends CrudRepository<OrderDetailsEntity, Integer> {

//	@Query("select from OrderDetailsEntity where orderProductName=?")
//	public OrderDetailsEntity findAllOrderProductName(String orderProductName);

//	@Query("select orderBy from OrderDetailsEntity")
//	public List<OrderDetailsEntity> findAllOrderBy();
	
	
	
	public OrderDetailsEntity  findByOrderBy(String orderBy);
	

}
