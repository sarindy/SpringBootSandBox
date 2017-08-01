package com.example.userController;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.securityCfg.Role;



@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	
	public Role findByRole(String role);

}
