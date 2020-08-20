package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cg.beans.User;
import com.cg.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao eDao;

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendNotification(User user) throws MailException {
		// send email
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmail());
		mail.setFrom("parkingexpress20@gmail.com");
		mail.setSubject("You have been registered");
		mail.setText("Dear" + " " + user.getUserName() + ",\r\n" + "Your Phone no" + " " + user.getPhoneNo() + " "
				+ "is added.Thank you for Getting Registered to PARKING EXPRESS PVT LTD ."
				+ " Hope You Like our Service ." + "Do give your valid feedback. ");

		javaMailSender.send(mail);
	}

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

		return this.eDao.findAll().stream().filter(f -> f.getRole().equalsIgnoreCase("customer"))
				.collect(Collectors.toList());

	}

	@Override
	public List<User> getallUser() {
		return this.eDao.findAll();
	}

}
