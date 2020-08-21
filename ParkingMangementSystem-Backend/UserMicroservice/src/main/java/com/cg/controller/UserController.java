package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.User;
import com.cg.service.UserService;

/*
 * @Autowired - The process of injection spring bean dependencies while initializing it
 * @RequestMapping - for configuring URI mapping in controller handler methods 
 * @PathVariable -  for mapping dynamic values from the URI to handler method arguments.
 * @CrossOrigin - enables cross-origin resource sharing only for this specific method. By default, its allows all origins, 
 *                all headers, and the HTTP methods specified in the @RequestMapping annotation
 * @ResponseBody - annotation maps the HttpRequest body to a transfer or domain object
 */
@RestController
@RequestMapping("/User")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	private UserService service;

	// http://localhost:8034/User/addUser
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {

		// checking whether the value exist previously
		List<User> allList = this.service.getallUser();
		for (int i = 0; i < allList.size(); i++) {
			if (allList.get(i).getUserName().equalsIgnoreCase(user.getUserName())) {
				return null;
			}
		}

		User customer = service.addUser(user);

		try {
			service.sendNotification(customer);
		} catch (MailException exp) {
			// catch error
			 System.err.println(exp.getMessage());
		}

		
		return customer;
	}

	// http://localhost:8034/User/getAllUsers
	@GetMapping("/getAllUsers")
	public List<User> getAllUser() {
		return this.service.getallUser();
	}
	
	// http://localhost:8034/User/getbyName
	@GetMapping("/getbyName/{uname}")
	public User getUserByName(@PathVariable("uname") String userName) {
		return service.getBookingByUsername(userName);
	
	}
}