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

import com.cg.beans.Parking;
import com.cg.beans.Slots;
import com.cg.service.ServiceParking;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/parking")
public class ParkingController {

	@Autowired
	private ServiceParking service;

	@PostMapping("/add")
	public Parking addParking(@RequestBody Parking parking) {
		return service.addSlot(parking);
	}

	@GetMapping("/getAll")
	public List<Parking> fetchAll() {
		return service.fetchAll();
	}

	@GetMapping("/updateStatus/{id}")
	public String updateStatus(@PathVariable("id") int slotId) {
       
		return service.updateStatus(slotId);	
	}
	
	@GetMapping("/getSlotById/{id}")
	public Slots findSlotById(@PathVariable("id") int slotId) {
		
		return service.getSlotById(slotId);
		
	}

	@PostMapping("/all/update/{id}")
	public Parking updateParking(@RequestBody Parking parking, @PathVariable("id") int slotId) {
		return service.update(parking, slotId);
	}

	@DeleteMapping("/all/delete/{id}")
	public String deleteParking(@PathVariable("id") int slotId) {
		return service.delete(slotId);
	}

	@GetMapping("/all/location/{location}")
	public List<Parking> findByLocation(@PathVariable("location") String location) {
		return service.findByLocation(location);
	}

	
	@GetMapping("/all/location/{location}/{type}")
	public List<Slots> findByLocationAndType(@PathVariable("location") String location,@PathVariable int type) {
		return service.findByLocationAndType(location,type);
	}
	

}

