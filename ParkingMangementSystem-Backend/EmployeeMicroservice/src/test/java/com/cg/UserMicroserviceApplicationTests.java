package com.cg;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.beans.User;
import com.cg.dao.UserDao;
import com.cg.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMicroserviceApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserDao repository ;
	
	@Test
	public void getAllFaculties() {
		when(repository.findAll()).thenReturn(Stream.of(new User(1, "Umashankar", "12345", "admin")).collect(Collectors.toList()));
		assertEquals(1, service.getallUser().size());
	}

//	@Test
//	public void getUserbyAddressTest() {
//		String address = "Bangalore";
//		when(repository.findByAddress(address))
//				.thenReturn(Stream.of(new User(376, "Danile", 31, "USA")).collect(Collectors.toList()));
//		assertEquals(1, service.getUserbyAddress(address).size());
//	}
//
	@Test
	public void saveUserTest() {
		User User = new User(1, "Shekhar", "12345", "participant");
		when(repository.save(User)).thenReturn(User);
		assertEqual(User, service.addUser(User));
	}

	@Test
	public void deleteUserTest() {
		User User = new User(1,"Shivani","12345","coordinatorS");
		service.deleteUser(User.getUserId());
		verify(repository, times(1)).deleteById(User.getUserId());
	}



}
