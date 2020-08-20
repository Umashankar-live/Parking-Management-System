package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.beans.BookSlot;
import com.cg.beans.User;
import com.cg.dao.BookingDao;

@Service
public class ServiceBookingImpl implements ServiceBooking {

	@Autowired
	private BookingDao bookingDao;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	RestTemplate restTemplate ;

	@Override
	public BookSlot addSlot(BookSlot booking) {
		return bookingDao.save(booking);
	}

	@Override
	public List<BookSlot> fetchAll() {
		return bookingDao.findAll();
	}

	@Override
	public String delete(Integer bookingId) {
		bookingDao.deleteById(bookingId);
		return "Parking Slot Removed Succesfully of bookId" + bookingId;
	}

	@Override
	public List<BookSlot> findByLocation(String location) {
		return bookingDao.findByLocation(location);
	}

	@Override
	public List<BookSlot> getBookingByUsername(String userName) {

		return bookingDao.findAll().stream().filter(x -> x.getUserName().equalsIgnoreCase(userName))
				.collect(Collectors.toList());
	}

	@Override
	public BookSlot getBookingById(Integer bookingId) {

		return bookingDao.findById(bookingId).get();
	}

	@Override
	public void generateBill(BookSlot booking) throws MailException {
		
		// getting the user email using restTemplate
		User user = restTemplate.getForObject("http://localhost:8034/User/getbyName/" + booking.getUserName(), User.class);
		
		// send email
				SimpleMailMessage mail = new SimpleMailMessage();
				mail.setTo(user.getEmail());
				mail.setFrom("parkingexpress20@gmail.com");
				mail.setSubject("Your Slot is Booked");
				mail.setText("Dear" + " " + booking.getUserName() + ",\r\n" + "Your Slot Booking of" + " " + booking.getLocation() + " "
						+"location for vehicle no :"+" "+booking.getVehicleNo()+" "+"which is a"+" " + booking.getType()+"wheeler is added." + 
						"\r\n" + "Date Of Booking :" +" "+booking.getDate()+
						"\r\n" + "Time Of Booking :" +" "+booking.getTime()+
						"\r\n" + "Total Duration :" + " " + booking.getHour()+" "+"hrs"+
						"\r\n" + "Total Bill :"+" "+booking.getTotalPrice()+" "+"rs"+"\r\n"
						+"Thank you for Getting Registered to Parking Express Pvt. Ltd. and hope you Liked our service.Do give your valid feedback. ");

				javaMailSender.send(mail);
		
	}

}
