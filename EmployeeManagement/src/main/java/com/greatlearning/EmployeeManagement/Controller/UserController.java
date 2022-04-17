package com.greatlearning.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.EmployeeManagement.Entity.Roles;
import com.greatlearning.EmployeeManagement.Entity.Users;
import com.greatlearning.EmployeeManagement.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	

	
	
	
	@PostMapping("/addUser")
	public Users saveUser(@RequestBody Users user) {
		
	return userService.saveUser(user);
	}
	
	
	@RequestMapping("/addRole")
	public Roles addRole(Roles roles) {
		
		
		return userService.addRole(roles);
	}
	
	
}
	
