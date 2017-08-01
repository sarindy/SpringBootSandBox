package com.example.userController;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.securityCfg.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByEmail(String email);

}
