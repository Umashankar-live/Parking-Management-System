package com.cg.service;

import java.util.List;

import com.cg.beans.Parking;

public interface ServiceParking {

	

	List<Parking> fetchAll();

	Parking update(Parking parking, int srno);

	String delete(int srno);

	List<Parking> findByLocation(String location);

<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingSlot/src/main/java/com/example/application/service/ServiceParking.java
	

=======
	Parking addSlot(Parking parking);
>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingSlot/src/main/java/com/cg/service/ServiceParking.java



}
