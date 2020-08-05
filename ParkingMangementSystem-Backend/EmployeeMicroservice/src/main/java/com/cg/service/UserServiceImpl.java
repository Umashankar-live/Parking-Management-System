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
		User User = eDao.save(e);
		return User;
	}

	@Override
	public boolean deleteUser(int empId) {
		eDao.deleteById(empId);
		return true;
	}

	@Override
	public User checkRole(int empId) {
		User User = eDao.findById(empId).get();
		return User;
	}

	@Override
	public List<User> getAllParticipant() {
//		List<User> originalList = this.eDao.findAll();
//		List<User> participantList = new ArrayList<>();
//		for (int i = 0; i < originalList.size(); i++) {
//			if(originalList.get(i).getRole().equalsIgnoreCase("participant")) {
//			   participantList.add(originalList.get(i)); 
//			}
//		}
//		
//		return participantList ;
		
		return this.eDao.findAll().stream().filter(f->f.getRole().equalsIgnoreCase("participant")).collect(Collectors.toList());
	
		
	}

	@Override
	public List<User> getallUser() {
		return this.eDao.findAll();
	}

}
