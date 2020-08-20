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
	public void deleteUser(int userId);
	public List<User> getAllCustomer();
	public void sendNotification(User user);
	public User getBookingByUsername(String userName);

}
