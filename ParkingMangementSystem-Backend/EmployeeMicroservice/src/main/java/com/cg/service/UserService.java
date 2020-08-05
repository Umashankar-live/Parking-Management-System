package com.cg.service;

import java.util.List;

import com.cg.beans.User;
/**
 * Add User
 * Delete User
 * Check Role
 * Get All Participant
 * 
 *
 */
public interface UserService {
	
	public User addUser(User e);
	public List<User> getallUser();
	public boolean deleteUser(int empId);
	public User checkRole(int empId);
	public List<User> getAllParticipant();

}
