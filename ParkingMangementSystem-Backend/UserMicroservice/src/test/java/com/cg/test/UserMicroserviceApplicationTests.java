package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.beans.User;
import com.cg.dao.UserDao;
import com.cg.service.UserService;

/**
 * Mocking is a way of producing dummy objects, operations, and results as if they were real scenarios. 
 * This means that it deals with no real database connections and no real server up and running. 
 * However, it mimics them so that the lines are also covered and expect the actual result
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMicroserviceApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserDao repository ;
	
	@Test
	public void getAllcustomertest() {
		when(repository.findAll()).thenReturn(Stream.of(new User(1, "Umashankar", "12345", "admin","uma123@gmail.com","7098709889","Male"), 
				new User(2,"Rupa","12345", "admin","rupa12@gmail.com","9876545678","Female")).collect(Collectors.toList()));
		assertEquals(2, service.getallUser().size());
	}


	@Test
	public void saveUserTest() {
		User User = new User(1, "Shekhar", "12345", "admin","Shekar2@gmail.com","9878987654","Male");
		when(repository.save(User)).thenReturn(User);
		assertEquals(User, service.addUser(User));
	}
	
	

	@Test
	public void deleteUserTest() {
		User User = new User(1,"Shivani","12345","admin","shivani32@gmail.com","7897897896","Female");
		service.deleteUser(1);
		verify(repository, times(1)).deleteById(User.getUserId());
	}



}
