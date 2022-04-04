package com.greatlearning.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.StudentManagement.Entity.Students;

@Repository

	public interface StudentRepository extends JpaRepository <Students, Integer> {

	}


