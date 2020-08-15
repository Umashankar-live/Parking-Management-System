package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.User;
import com.cg.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao eDao;

	@Override
	public User addUser(User e) {
		return eDao.save(e);
	}

	@Override
	public void deleteUser(int userId) {
		eDao.deleteById(userId);
		
	}

	
	@Override
	public List<User> getAllCustomer() {
		
		return this.eDao.findAll().stream().filter(f->f.getRole().equalsIgnoreCase("customer")).collect(Collectors.toList());
	
		
	}

	@Override
	public List<User> getallUser() {
		return this.eDao.findAll();
	}

}
