package com.cg.service;

import java.util.List;

import com.cg.beans.Parking;
import com.cg.beans.Slots;

public interface ServiceParking {

	

	List<Parking> fetchAll();

	Parking update(Parking parking, int srno);

	String delete(int srno);

	List<Parking> findByLocation(String location);
<<<<<<< HEAD
=======

	Parking addSlot(Parking parking);

	List<Slots> findByLocationAndType(String location, int type);

>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
	
	String updateStatus (int slotId);

<<<<<<< HEAD
	Parking addSlot(Parking parking);
	
	Slots getSlotById (int slotId);
=======

>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065


}
