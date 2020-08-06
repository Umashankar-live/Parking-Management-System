package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Parking;
import com.cg.service.ServiceParking;

@RestController
public class ParkingController {

	@Autowired
	private ServiceParking service;

	@PostMapping("/add")
	public Parking addParking(@RequestBody Parking parking) {
		return service.addSlot(parking);
	}

	@GetMapping("/get")
	public List<Parking> fetchAll() {
		return service.fetchAll();
	}

	@PostMapping("/all/update/{id}")
	public Parking updateParking(@RequestBody Parking parking, @PathVariable("id") int srno) {
		return service.update(parking, srno);
	}

	@DeleteMapping("/all/delete/{id}")
	public String deleteParking(@PathVariable("id") int srno) {
		return service.delete(srno);
	}

	@GetMapping("/all/location/{location}")
	public List<Parking> findByLocation(@PathVariable("location") String location) {
		return service.findByLocation(location);
	}
<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingSlot/src/main/java/com/example/application/controller/ParkingController.java
	
	
=======

>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingSlot/src/main/java/com/cg/controller/ParkingController.java
}
