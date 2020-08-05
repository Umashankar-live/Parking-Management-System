package com.example.application.service;

import java.util.List;

import com.example.application.beans.Parking;
import com.example.application.beans.Slots;

public interface ServiceParking {

	Parking add(Parking parking);

	List<Parking> fetchAll();

	Parking update(Parking parking, int srno);

	String delete(int srno);

	List<Parking> findByLocation(String location);



}
