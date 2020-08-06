package com.cg.service;

import java.util.List;

import com.cg.beans.Parking;
import com.cg.beans.Slots;

public interface ServiceParking {

	

	List<Parking> fetchAll();

	Parking update(Parking parking, int srno);

	String delete(int srno);

	List<Parking> findByLocation(String location);
	
	String updateStatus (int slotId);

	Parking addSlot(Parking parking);
	
	Slots getSlotById (int slotId);


}
