package com.example.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.securityCfg.UserAuthentication;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserAuthentication userAuth;

	@RequestMapping("/initRole")
	public String InitialRole() {
		Role role = new Role();
		role.setRole("ADMIN");
		userService.saveRole(role);
		role = new Role();
		role.setRole("API");
		userService.saveRole(role);
		role = new Role();
		role.setRole("USER");
		userService.saveRole(role);
		return "Default Roles Created";
	}

	@RequestMapping("/initAdmin")
	public String InitialAdmin() {
		User user = new User("Sarindy", "Ouk", "admin@dnynn.com", "123456", 1);
		userService.saveUser(user, "ADMIN");
		return "Admin Created";
	}

	@RequestMapping("/initApi")
	public String InitialApi() {
		User user = new User("Sarindy", "Ouk", "api@dnynn.com", "123456", 1);
		userService.saveUser(user, "API");

		return "API Created";
	}

	@RequestMapping("/initUser")
	public String InitialUser() {
		User user = new User("Sarindy", "Ouk", "user@dnynn.com", "123456", 1);
		userService.saveUser(user, "USER");
		return "User Created";
	}

	@RequestMapping("/testUser")
	public String testUser() {

		User user = new User();
		user = userService.findUserByEmail("api@dnynn.com");
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(userAuth.Authenticated(user, "123456"));

		return "User Created";
	}

}
