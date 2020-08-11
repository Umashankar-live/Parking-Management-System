package com.cg.service;

import java.util.List;

import com.cg.beans.Parking;
import com.cg.beans.Slots;

public interface ServiceParking {

	

	List<Parking> fetchAll();

	Parking update(Parking parking, int srno);

	String delete(int srno);

	List<Parking> findByLocation(String location);

	Parking addSlot(Parking parking);

	List<Slots> findByLocationAndType(String location, int type);

	
	String bookedStatus (int slotId);

	
	Slots getSlotById (int slotId);
	
	Parking getParkingById(int srno) ;

	void deleteAllSlots(String location);

	String cancelStatus(int slotId);


}
