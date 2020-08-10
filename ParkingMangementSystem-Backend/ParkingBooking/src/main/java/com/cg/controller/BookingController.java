package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.beans.BookSlot;
import com.cg.service.ServiceBooking;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	ServiceBooking service;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/add/{slotId}")
	public BookSlot addBookSlot(@RequestBody BookSlot BookSlot, @PathVariable("slotId") int slotId) {

		String status = restTemplate.getForObject("http://localhost:8035/parking/updateStatus/" + slotId, String.class);
		System.out.println(status);
		return service.addSlot(BookSlot);

	}

	@GetMapping("/get")
	public List<BookSlot> fetchAll() {
		return service.fetchAll();
	}

	@GetMapping("/getbyName/{uname}")
	public List<BookSlot> getBookingByName(@PathVariable("uname") String userName) {
		return service.getBookingByUsername(userName);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBookSlot(@PathVariable("id") Integer bookingId) {
		return service.delete(bookingId);
	}

	@GetMapping("/location/{location}")
	public List<BookSlot> findByLocation(@PathVariable("location") String location) {
		return service.findByLocation(location);
	}

	@GetMapping("/getBookingByUserId/{username}")
	public List<BookSlot> getBookingByUserId(@PathVariable("username") String userName) {
		System.out.println("inBookingUserId");
		return service.getBookingByUsername(userName);
	}

}
