package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Login;
import com.cg.beans.User;
import com.cg.service.LoginService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	//http://localhost:8037/login/validate
	@RequestMapping(value = "/validate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User validate(@RequestBody Login login) {
		User user = service.validate(login);
		return user;
	}

	
}
