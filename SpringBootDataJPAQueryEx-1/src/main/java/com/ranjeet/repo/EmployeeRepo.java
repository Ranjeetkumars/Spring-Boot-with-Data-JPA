package com.ranjeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ranjeet.model.ProEmployee;

public interface EmployeeRepo extends JpaRepository<ProEmployee, Integer> {
	
	
	@Query("SELECT e FROM ProEmployee e")
	List<ProEmployee> getAllProEmployee();
	
	
//	@Query("SELECT e FROM ProEmployee e WHERE empDept=?1")
//	List<ProEmployee> getAllProEmployeeByDept(String dept);
	
	
//	@Query("SELECT e FROM ProEmployee e WHERE empDept=?1 AND Id=?2")
//	List<ProEmployee> getAllProEmployeeByDeptAndId(String dept, Integer id);
	
	
	
	@Query("SELECT e FROM ProEmployee e WHERE empDept=?1 AND Id>?2")
	List<ProEmployee> getAllProEmployeeByDeptAndId(String dept, Integer id);
	
	//
//	@Query("from com.ranjeet.model.ProEmployee")
//	List<ProEmployee> getAllProEmployee();
	
	
	@Query("SELECT e FROM ProEmployee e WHERE Id between ?1 and ?2")
	List<ProEmployee> getAllProEmployeeByIdBetWeen(Integer id,Integer id1); 
	
	//SQL QUERY
	@Query(nativeQuery = true,value="SELECT * FROM pro_employee")
	List<ProEmployee> getAllProEmployeeBYSQLPureQuery();
	
	//Named parameter(:anyName) must match with method parameter
//	@Query("SELECT e FROM ProEmployee e WHERE Id between :id and :id1")
//	List<ProEmployee> getAllProEmployeeByIdBetWeeninfo(Integer id,Integer id1); 
	
	
	@Query("SELECT e FROM ProEmployee e WHERE Id in (:id)")
	List<ProEmployee> getAllProEmployeeById(List<Integer> id);

}
