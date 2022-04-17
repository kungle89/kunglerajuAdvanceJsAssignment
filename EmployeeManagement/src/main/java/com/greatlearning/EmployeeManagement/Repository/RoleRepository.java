package com.greatlearning.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagement.Entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
