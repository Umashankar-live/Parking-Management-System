package com.example.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.beans.Parking;
import com.example.application.beans.Slots;
import com.example.application.repository.ParkingDao;
import com.example.application.repository.SlotDao;
@Service
public class ServiceImpl  implements ServiceParking{
	
	
	@Autowired
	private ParkingDao dao;
	
	@Autowired
	private SlotDao sdao;
	
	@Autowired
	public Slots slots;
	
	
	@Override
	public Parking add(Parking parking) {
	return	dao.save(parking);	
		
	}

	
	@Override
	public List<Parking> fetchAll() {
		return dao.findAll();
	}

	@Override
	public Parking update(Parking parking, int srno) {
		return dao.findById(srno).map(p ->{
			p.setLocation(parking.getLocation());
			p.setTwoWheelerTotal(parking.getTwoWheelerTotal());
			p.setTwoWheelerAvailable(parking.getTwoWheelerAvailable());
			p.setFourWheelerTotal(parking.getFourWheelerTotal());
			p.setFourWheelerAvailable(parking.getFourWheelerAvailable());
			return dao.save(p);
			
		}).orElseGet(()->{
			parking.setSrno(srno);
			return dao.save(parking);
			
		});
	}

	@Override
	public String delete(int srno) {
		dao.deleteById(srno);
		return "Parking Slot Removed Succesfully of Srno" + srno; 
	}

	@Override
	public List<Parking> findByLocation(String location) {
		return dao.findByLocation(location);
	}
	
	
	
}
