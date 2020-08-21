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

/*
 * @Autowired - The process of injection spring bean dependencies while initializing it
 * @RequestMapping - for configuring URI mapping in controller handler methods 
 * @PathVariable -  for mapping dynamic values from the URI to handler method arguments.
 * @CrossOrigin - enables cross-origin resource sharing only for this specific method. By default, its allows all origins, 
 *                all headers, and the HTTP methods specified in the @RequestMapping annotation
 * @ResponseBody - annotation maps the HttpRequest body to a transfer or domain object
 */
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

	// http://localhost:8035/parking/getAll
	@GetMapping("/getAll")
	public List<Parking> fetchAll() {
		return service.fetchAll();
	}

	@GetMapping("/bookedStatus/{id}")
	public String bookedStatus(@PathVariable("id") int slotId) {
		// updating the available status
		Slots slot = service.getSlotById(slotId);
		Parking park = service.findParking(slot.getLocation());
		if (slot.getType() == 4)
			park.setFourWheelerAvailable(park.getFourWheelerTotal() - 1);
		else
			park.setTwoWheelerAvailable(park.getTwoWheelerTotal() - 1);

		return service.bookedStatus(slotId);
	}

	@GetMapping("/cancelStatus/{id}")
	public String cancelStatus(@PathVariable("id") int slotId) {
		// updating the available status
		Slots slot = service.getSlotById(slotId);
		Parking park = service.findParking(slot.getLocation());
		if (slot.getType() == 4)
			park.setFourWheelerAvailable(park.getFourWheelerAvailable() + 1);
		else
			park.setTwoWheelerAvailable(park.getTwoWheelerAvailable() + 1);

		return service.cancelStatus(slotId);
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
	public void deleteParking(@PathVariable("id") int srno) {
		Parking park = service.getParkingById(srno);
		service.deleteAllSlots(park.getLocation());
		service.delete(srno);
	}

	@GetMapping("/all/location/{location}")
	public List<Parking> findByLocation(@PathVariable("location") String location) {
		return service.findByLocation(location);
	}

	@GetMapping("/all/location/{location}/{type}")
	public List<Slots> findByLocationAndType(@PathVariable("location") String location, @PathVariable int type) {
		return service.findByLocationAndType(location, type);
	}

}
