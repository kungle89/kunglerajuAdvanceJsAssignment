package com.greatlearning.EmployeeManagement.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.EmployeeManagement.Entity.Employee;
import com.greatlearning.EmployeeManagement.Service.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> findAllEmployees() {
				
		return employeeService.findAllEmployees();
	}
	
	@RequestMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	
		
		return employee;
	}
	
	@RequestMapping("/updateEmployee")
	public Employee showFormForUpdate(@RequestBody Employee employee) {
		
		return employeeService.updateEmployee(employee);
		
	}
	
	@RequestMapping("/sort")
	public List<Employee> sortEmployee( @RequestParam String order) {
		
		return employeeService.sortBy(order);
		
		
		 
	}
	
	@GetMapping("/listById")
	public Employee findById(@RequestParam int id) {
		return employeeService.findById(id);
	}

	@GetMapping("/searchByName")
	public List<Employee> findByName(@RequestParam String name) {
		return employeeService.findByName(name);
	}
	
	
	@RequestMapping("/delete")
	public void delete(@RequestParam("id") int id) {
			employeeService.deleteById(id);
		
	}
	
	
	
}