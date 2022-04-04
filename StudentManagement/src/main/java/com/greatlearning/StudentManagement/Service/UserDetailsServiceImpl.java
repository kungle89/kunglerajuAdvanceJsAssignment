package com.greatlearning.StudentManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.StudentManagement.Entity.User;
import com.greatlearning.StudentManagement.Repository.UserRepository;
import com.greatlearning.StudentManagement.Security.StudentUserDetails;



public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired 
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
        
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new StudentUserDetails(user);
	
	}

}
