package com.greatlearning.crm.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.crm.Entity.Customer;


@Service
public interface CustomerService {
	
// CRUD functionalities
// Method to Retrieve all customer records	
	public List<Customer> findAll();
	
// Find customer record by using its id
	public Customer findById(int id);
	
// Insert and update method
	public void save(Customer cust);
	
// Delete method
	public void deleteById(int id);

}