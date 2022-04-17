package com.greatlearning.EmployeeManagement.Service;

import com.greatlearning.EmployeeManagement.Entity.Roles;
import com.greatlearning.EmployeeManagement.Entity.Users;

public interface UserService {
	
	public Roles addRole(Roles roles);
	
	public Users saveUser(Users users);
	
}



