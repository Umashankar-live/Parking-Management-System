package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.beans.Parking;

public interface ParkingDao extends JpaRepository<Parking, Integer> {

	@Query("Select p from Parking p Where p.location=?1")
	List<Parking> findByLocation(String location);

}
