package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.beans.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	
	@Query("Select u from User u Where u.userName=?1")
	User findByUserName(String userName);

}
