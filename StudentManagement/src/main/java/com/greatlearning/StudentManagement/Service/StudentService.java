package com.greatlearning.StudentManagement.Service;

import java.util.List;

import com.greatlearning.StudentManagement.Entity.Students;


public interface StudentService {
	
    public List<Students> findAll();

	public void save(Students theStudent);

	public void deleteById(int theId);
	
	public Students findById(int id);


}