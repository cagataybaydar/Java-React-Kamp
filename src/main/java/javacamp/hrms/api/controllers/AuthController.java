package javacamp.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.AuthService;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	private AuthService authService;
	
	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody Employers employers,String confirmPassword) {
		return authService.registerEmployer(employers, confirmPassword);
	}
	
	@PostMapping("/registerCandidate")
	public Result registerCandidate(@RequestBody Candidates candidates,String confirmPassword) {
		return authService.registerCandidates(candidates, confirmPassword);
	}
	
}
