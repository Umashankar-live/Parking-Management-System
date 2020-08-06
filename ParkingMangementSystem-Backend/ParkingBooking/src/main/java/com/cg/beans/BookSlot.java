package com.cg.beans;

<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/example/application/beans/BookSlot.java
import java.sql.Date;
import javax.persistence.Column;
=======

import java.util.Date;

>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/cg/beans/BookSlot.java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class BookSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	@DateTimeFormat(pattern = "HH:mm")
	private Date time ; 
	
	private String location ;
	
<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/example/application/beans/BookSlot.java
	@DateTimeFormat(pattern = "HH:mm")
	private Date time;
=======
	private int slotNo ;
>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/cg/beans/BookSlot.java
	
	private int hour;
	

	private int Type;
	
	private String vehicleNo;
	
	private int totalPrice;
	
	public BookSlot() {}

<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/example/application/beans/BookSlot.java
	public BookSlot(int srNo, int bookingId, Date date, Date time, int hour, int type, String vehicleNo,
			int totalPrice) {
		super();
		this.srNo = srNo;
		this.bookingId = bookingId;
		this.date = date;
		this.time = time;
		this.hour = hour;
		Type = type;
		this.vehicleNo = vehicleNo;
		TotalPrice = totalPrice;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public int getBookingId() {
=======
	public Integer getBookingId() {
>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/cg/beans/BookSlot.java
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/example/application/beans/BookSlot.java
=======
	

>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/cg/beans/BookSlot.java
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/example/application/beans/BookSlot.java
	
=======

>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingBooking/src/main/java/com/cg/beans/BookSlot.java
	
}
