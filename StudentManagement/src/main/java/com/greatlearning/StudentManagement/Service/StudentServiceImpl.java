package com.greatlearning.StudentManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.StudentManagement.Entity.Students;
import com.greatlearning.StudentManagement.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;



@Service
public class StudentServiceImpl implements StudentService  {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		List<Students> students = studentRepository.findAll();
		return students;
	}

	@Override
	public void save(Students theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
		
	}

	@Override
	public Students findById(int id) {
		// TODO Auto-generated method stub
		Students student = studentRepository.findById(id).get();
		return student;
	}

}