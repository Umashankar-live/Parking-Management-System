package com.cg.service;

import com.cg.beans.User;
import com.cg.beans.Login;


public interface LoginService {
	
	public User validate(Login login);

}
