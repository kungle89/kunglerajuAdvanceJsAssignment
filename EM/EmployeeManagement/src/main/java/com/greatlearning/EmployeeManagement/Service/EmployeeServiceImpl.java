package com.greatlearning.EmployeeManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagement.Entity.Employee;
import com.greatlearning.EmployeeManagement.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		
		

		employeeRepository.save(employee);
	}

	

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}



	@Override
	public List<Employee> sortBy(String order) {
		
		
		if (order.equals("asc")) {
			return employeeRepository.findAll(Sort.by(Sort.Direction.ASC,"firstName"));
		} else if (order.equals("dsc")) {
			return employeeRepository.findAll(Sort.by(Sort.Direction.DESC,"firstName"));
		}
		return null;
	}
	
	@Override
	public Employee findById(int id) {
		return employeeRepository.findById(id).get();
		
	}
	
	@Override
	public List<Employee> findByName(String name) {
		return employeeRepository.findByFirstName(name);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee employeeUpdate = employeeRepository.getById(employee.getId());;
		if (employeeUpdate != null) {
			employeeUpdate.setFirstName(employee.getFirstName());
			employeeUpdate.setLastName(employee.getLastName());
			employeeUpdate.setEmail(employee.getEmail());
			 employeeRepository.save(employeeUpdate);
		}
		return null;
	}
	}

	

	
	

