package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Parking;
import com.cg.beans.Slots;
import com.cg.repository.ParkingDao;
import com.cg.repository.SlotDao;

@Service
public class ServiceParkingImpl implements ServiceParking {

	@Autowired
	private ParkingDao dao;

	@Autowired
	private SlotDao sdao;

	

	@Override
	public Parking addSlot(Parking parking) {

		for (int slot = 1; slot <= parking.getTwoWheelerTotal(); slot++) {
			Slots slots = new Slots();
			slots.setLocation(parking.getLocation());
			slots.setSlots(slot);
			slots.setStatus(true);
			slots.setType(2);
			sdao.save(slots);
		}

		for (int b = 1; b <= parking.getFourWheelerAvailable(); b++) {
			// System.out.println(parking.getFourWheelerAvailable())
			Slots slots = new Slots();
			slots.setLocation(parking.getLocation());
			slots.setSlots(b);
			slots.setStatus(true);
			slots.setType(4);
			sdao.save(slots);
		}
		return dao.save(parking);

	}

	@Override
	public List<Parking> fetchAll() {
		return dao.findAll();
	}

	@Override
	public Parking update(Parking parking, int srno) {
		return dao.findById(srno).map(p -> {
			p.setLocation(parking.getLocation());
			p.setTwoWheelerTotal(parking.getTwoWheelerTotal());
			p.setTwoWheelerAvailable(parking.getTwoWheelerAvailable());
			p.setFourWheelerTotal(parking.getFourWheelerTotal());
			p.setFourWheelerAvailable(parking.getFourWheelerAvailable());
			return dao.save(p);

		}).orElseGet(() -> {
			parking.setSrno(srno);
			return dao.save(parking);

		});
	}

	@Override
	public String delete(int slotId) {
		dao.deleteById(slotId);
		return "Parking Slot Removed Succesfully of slotId" + slotId;
	}

	@Override
	public List<Parking> findByLocation(String location) {
		return dao.findByLocation(location);
	}

	@Override
	public Slots getSlotById(int slotId) {
	
		return sdao.findById(slotId).get();
	}

	@Override
	public String updateStatus(int slotId) {
	
	 sdao.update(slotId);
	  return "Status Updated for the slots";
		
		
	}

}
