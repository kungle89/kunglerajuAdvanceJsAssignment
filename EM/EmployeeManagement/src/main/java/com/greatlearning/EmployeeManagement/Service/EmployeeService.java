package com.greatlearning.EmployeeManagement.Service;

import java.util.List;

import com.greatlearning.EmployeeManagement.Entity.Employee;

public interface EmployeeService {


	
	public Employee findById(int id);
	
	public void deleteById(int id);
	
	
	public List<Employee> sortBy(String order);

	public List<Employee> findAllEmployees();

	public Employee updateEmployee(Employee employee);


	public List<Employee> findByName(String name);


	public void addEmployee(Employee employee);
}
