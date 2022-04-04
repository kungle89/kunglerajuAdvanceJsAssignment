package com.greatlearning.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.StudentManagement.Entity.User;

@Repository


public interface UserRepository extends JpaRepository <User, Long> {
	public User getUserByUsername(String username);
}