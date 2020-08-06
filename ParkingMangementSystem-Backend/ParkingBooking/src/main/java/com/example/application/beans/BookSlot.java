package com.example.application.beans;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class BookSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int srNo;
	
	private int bookingId;
	
	private Date date;
	
	@DateTimeFormat(pattern = "HH:mm")
	private Date time;
	
	private int hour;
	
	@Column(name="2_Wheeler = 2, 4_Wheeler = 4")
	private int Type;
	
	private String vehicleNo;
	
	private int TotalPrice;
	
	public BookSlot() {}

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
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
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
		return TotalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}

	
	
}
