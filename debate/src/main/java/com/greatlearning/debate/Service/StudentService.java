package com.greatlearning.debate.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.debate.Entity.Students;

@Service
public interface StudentService {

	public List<Students> findAll();

	// Find student record by using its id
	public Students findById(int id);

	// Insert and update method
	public void save(Students student);

	// Delete method
	public void deleteById(int id);

}


