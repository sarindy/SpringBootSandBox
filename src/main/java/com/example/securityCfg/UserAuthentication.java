package com.example.securityCfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@Configuration
public class UserAuthentication {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public Boolean Authenticated(User user, String password) {
		return bCryptPasswordEncoder.matches(password, user.getPassword());
	}

}
