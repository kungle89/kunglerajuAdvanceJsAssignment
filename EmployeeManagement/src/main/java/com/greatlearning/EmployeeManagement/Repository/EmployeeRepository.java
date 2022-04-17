package com.greatlearning.EmployeeManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagement.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findByFirstName(String name);
	
//	List<Employee> findByOrderByFirstNameContainsAllIgnoreCaseAsc(String firstName);
}