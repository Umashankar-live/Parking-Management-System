package com.cg;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.dao.BookingDao;
import com.cg.service.ServiceBooking;

@RunWith(SpringRunner.class)
@SpringBootTest
class ParkingBookingApplicationTests {

	@Autowired
	private ServiceBooking service ;

	@MockBean
	private BookingDao  dao ;
	
	//@Test
	//public void getAllBookingTest() {
	//	when(dao.findAll()).thenReturn(Stream
			//	.of(new BookSlot(1, "2020-10-11", "Mumbai", 15:11, 1, 1, 1, "xyz123", "uma", 200)).collect(Collectors.toList()));		
			//	System.out.println(service.fetchAll());
		//assertEquals(2, service.fetchAll().size());
	//}
}
