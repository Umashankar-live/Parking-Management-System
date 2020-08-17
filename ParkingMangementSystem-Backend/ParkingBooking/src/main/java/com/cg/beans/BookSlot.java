package com.cg.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//GenerationType indicates that the persistence provider should automatically pick an appropriate strategy for the particular database.
//This is the default GenerationType
@Entity
public class BookSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;

	private LocalDate date;

	private String location;

	private LocalTime time;

	private int slotNo;

	private int hour;

	private int type;

	private String vehicleNo;

	private String userName;

	private int totalPrice;

	public BookSlot() {
	}

	public BookSlot(Integer bookingId, LocalDate date, String location, LocalTime time, int slotNo, int hour, int type,
			String vehicleNo, String userName, int totalPrice) {
		super();
		this.bookingId = bookingId;
		this.date = date;
		this.location = location;
		this.time = time;
		this.slotNo = slotNo;
		this.hour = hour;
		this.type = type;
		this.vehicleNo = vehicleNo;
		this.userName = userName;
		this.totalPrice = totalPrice;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
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
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
