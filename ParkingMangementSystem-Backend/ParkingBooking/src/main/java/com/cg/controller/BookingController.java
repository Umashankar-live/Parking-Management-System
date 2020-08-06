package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.BookSlot;
import com.cg.service.ServiceBooking;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	ServiceBooking service ;
	
	@PostMapping("/add")
	public BookSlot addBookSlot(@RequestBody BookSlot BookSlot) {
		return service.addSlot(BookSlot);
	}

	@GetMapping("/get")
	public List<BookSlot> fetchAll() {
		return service.fetchAll();
	}

	
	@GetMapping("/booking/{bookingId}")
	public BookSlot getBooking(@PathVariable int bookingId) {
		return service.getBooking(bookingId);
	}

	
	@DeleteMapping("/delete/{id}")
	public String deleteBookSlot(@PathVariable("id") Integer bookingId) {
		return service.delete(bookingId);
	}

	@GetMapping("/location/{location}")
	public List<BookSlot> findByLocation(@PathVariable("location") String location) {
		return service.findByLocation(location);
	}
	
	@GetMapping("/getBookingByUserId/{userId}")
	public List<BookSlot> getBookingByUserId(@PathVariable int userId){
		System.out.println("inBookingUserId");
		return service.getBookingByUserId(userId);
	}
	
	
	
	

}
