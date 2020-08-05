package com.example.application.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.beans.Parking;
import com.example.application.beans.Slots;
import com.example.application.service.ServiceParking;
import com.google.j2objc.annotations.AutoreleasePool;

@RestController
public class ParkingController {

	
	@Autowired
	private ServiceParking service;
	
	@PostMapping("/add")
	public Parking add(@RequestBody Parking parking) {
		return service.add(parking);
	}
	
	@GetMapping("/get")
	public List<Parking> fetchAll(){
		return service.fetchAll();
	}	
	
	@PostMapping("/all/update/{id}")
	public Parking updateParking(@RequestBody Parking parking,
			@PathVariable("id") int srno) {
		return service.update(parking,srno);
	}
	
	@DeleteMapping("/all/delete/{id}")
	public String deleteParking(@PathVariable("id") int srno) {
		return service.delete(srno);
	}
	
	@GetMapping("/all/location/{location}")
	public List<Parking> findByLocation(@PathVariable("location")String location){
		return service.findByLocation(location);
	}	
	
}
