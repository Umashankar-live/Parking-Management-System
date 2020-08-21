package com.cg.service;

import com.cg.beans.Login;
import com.cg.beans.User;

public interface LoginService {

	public User validate(Login login);

}
