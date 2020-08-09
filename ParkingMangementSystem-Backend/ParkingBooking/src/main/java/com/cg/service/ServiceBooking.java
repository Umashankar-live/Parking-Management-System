package com.cg.service;

import java.util.List;

import com.cg.beans.BookSlot;

public interface ServiceBooking {

	List<BookSlot> fetchAll();

	String delete(Integer bookingId);

	List<BookSlot> findByLocation(String location);

	BookSlot addSlot(BookSlot booking);

	BookSlot getBookingById(Integer bookingId);

	List<BookSlot> getBookingByUsername(String userName);

}
