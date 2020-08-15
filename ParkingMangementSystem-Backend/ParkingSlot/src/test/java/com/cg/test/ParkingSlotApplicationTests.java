package com.cg.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.beans.Parking;
import com.cg.repository.ParkingDao;
import com.cg.repository.SlotDao;
import com.cg.service.ServiceParking;



/**
 * Mocking is a way of producing dummy objects, operations, and results as if they were real scenarios. 
 * This means that it deals with no real database connections and no real server up and running. 
 * However, it mimics them so that the lines are also covered and expect the actual result
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingSlotApplicationTests {

	@Autowired
	private ServiceParking service ;

	@MockBean
	private ParkingDao  dao ;
	
	@MockBean
	private SlotDao sdao ;
	
	@Test
	public void getAllParkingListTest() {
		when(dao.findAll()).thenReturn(Stream
				.of(new Parking(1, "Mumbai", 4, 4, 2, 2), new Parking(2, "Pune", 3, 2, 4, 4)).collect(Collectors.toList()));
		System.out.println(service.fetchAll());
		assertEquals(2, service.fetchAll().size());
		
	}
	
	@Test
	public void getParkingById() {
		
		when(dao.findById(1).get()).thenReturn(new Parking(1, "Mumbai", 2, 2, 2, 2));
		Parking park = service.getParkingById(1);
		System.out.println(park);
	    assertEquals("Mumbai", park.getLocation());
	}
	
	@Test
	public void saveParkingTest() {
		Parking par = new Parking(1, "Pune", 3, 3, 4, 4);
		when(dao.save(par)).thenReturn(par);
		System.out.println(par);
		assertEquals(par, service.addSlot(par));
	}
	
	
	@Test
	public void deleteParkingeTest() {
		Parking park = new Parking(1, "Pune", 3, 3, 4, 4);
		service.delete(1);
		verify(dao, times(1)).deleteById(park.getSrno());
	}
	
	
	

}
