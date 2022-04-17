package com.greatlearning.EmployeeManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagement.Entity.Roles;
import com.greatlearning.EmployeeManagement.Entity.Users;
import com.greatlearning.EmployeeManagement.Repository.RoleRepository;
import com.greatlearning.EmployeeManagement.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Roles addRole(Roles roles) {
		return roleRepository.save(roles);
	}

	@Override
	public Users saveUser(Users users) {
		
		return userRepository.save(users);
	}

}
