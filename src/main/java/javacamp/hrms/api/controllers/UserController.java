package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.UserService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.entities.concretes.Users;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Users>> getAll(){
		return this.userService.getAll();
	}
	
}
