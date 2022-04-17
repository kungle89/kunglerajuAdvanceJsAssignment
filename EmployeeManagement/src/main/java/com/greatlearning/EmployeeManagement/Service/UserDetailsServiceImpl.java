package com.greatlearning.EmployeeManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.EmployeeManagement.Entity.Users;
import com.greatlearning.EmployeeManagement.Repository.UserRepository;
import com.greatlearning.EmployeeManagement.Security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user = userRepository.getByUsername(username);
		return new MyUserDetails(user);
	}
	
}
