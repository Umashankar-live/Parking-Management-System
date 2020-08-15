package com.cg;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.dao.UserDao;
import com.cg.service.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
class LoginMicroserviceApplicationTests {

	@Autowired
	private LoginService loginservice ;
	
	@MockBean
	private UserDao dao ;

}
