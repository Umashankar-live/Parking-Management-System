package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.User;
import com.cg.service.UserService;

@RestController
@RequestMapping("/User")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	private UserService service;

	// http://localhost:8034/User/addUser
	@PostMapping("/addUser")
	public User addUser(@RequestBody User e) {

		// checking whether the value exist previously
		List<User> allList = this.service.getallUser();
		for (int i = 0; i < allList.size(); i++) {
			if (allList.get(i).getUserName().equalsIgnoreCase(e.getUserName())) {
				return null;
			}
		}

		try {
			service.sendNotification(e);
		} catch (MailException exp) {
			// catch error
			 System.err.println(exp.getMessage());
		}

		User user = service.addUser(e);
		return user;
	}

	// http://localhost:8034/User/getAllUsers
	@GetMapping("/getAllUsers")
	public List<User> getAllUser() {
		return this.service.getallUser();
	}

}
