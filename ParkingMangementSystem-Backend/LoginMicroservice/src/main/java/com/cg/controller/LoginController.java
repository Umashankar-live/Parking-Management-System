package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.User;
import com.cg.beans.Login;
import com.cg.service.LoginService;
import com.cg.service.LoginServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	//http://localhost:8035/login/validate
	@RequestMapping(value = "/validate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User validate(@RequestBody Login login) {
		User user = service.validate(login);
		return user;
	}

	
}
