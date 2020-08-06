package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.BookSlot;
import com.cg.dao.BookingDao;

@Service
public class ServiceBookingImpl implements ServiceBooking {
	
	@Autowired
	BookingDao bdao ;

	@Override
	public List<BookSlot> fetchAll() {
		return bdao.findAll(); 
	}


	@Override
	public String delete(Integer bookingId) {
		bdao.deleteById(bookingId);
		return "Parking Slot Removed Succesfully of bookId" + bookingId;
	}

	@Override
	public List<BookSlot> findByLocation(String location) {
		return bdao.findByLocation(location);
	}

	@Override
	public BookSlot addSlot(BookSlot booking) {
		return bdao.save(booking);
	}

}
