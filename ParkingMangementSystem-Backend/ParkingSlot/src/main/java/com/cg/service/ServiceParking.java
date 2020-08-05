package com.cg.service;

import java.util.List;

import com.cg.beans.Parking;

public interface ServiceParking {

	

	List<Parking> fetchAll();

	Parking update(Parking parking, int srno);

	String delete(int srno);

	List<Parking> findByLocation(String location);

	Parking addSlot(Parking parking);



}
