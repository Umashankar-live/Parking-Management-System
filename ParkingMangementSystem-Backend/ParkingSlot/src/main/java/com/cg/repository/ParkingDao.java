package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.beans.Parking;

@Repository
public interface ParkingDao extends JpaRepository<Parking, Integer> {

	@Query("Select p from Parking p Where p.location=?1")
	List<Parking> findByLocation(String location);

	
	@Query("Select p from Parking p Where p.location=?1")
	Parking findParking(String location);

}
