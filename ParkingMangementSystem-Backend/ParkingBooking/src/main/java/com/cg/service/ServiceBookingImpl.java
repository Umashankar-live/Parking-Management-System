package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.BookSlot;
import com.cg.dao.BookingDao;

@Service
public class ServiceBookingImpl implements ServiceBooking {

	@Autowired
	private BookingDao bookingDao;

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

}
