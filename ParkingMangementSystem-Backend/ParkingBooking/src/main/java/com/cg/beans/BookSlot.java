package com.cg.beans;

<<<<<<< HEAD

=======
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065

import java.time.LocalDate;
import java.time.LocalTime;

<<<<<<< HEAD
=======
import javax.persistence.Column;
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class BookSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	
<<<<<<< HEAD
	private String fName ;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	private String location ;
	
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
	@Temporal(TemporalType.TIME)
	private Date time;

	private int slotNo ;

=======
	private LocalDate date ;
	private String location ;
	
	
	private LocalTime time;
	private int slotNo ;
	
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
	private int hour;
	
	private int Type;
	
	private String vehicleNo;
	private int userId;
	private String userName; 
	private int totalPrice;
	
	public BookSlot() {}

<<<<<<< HEAD
=======
	

	public BookSlot(Integer bookingId, LocalDate date, String location, LocalTime time, int slotNo, int hour, int type,
			String vehicleNo, int userId, String userName, int totalPrice) {
		super();
		this.bookingId = bookingId;
		this.date = date;
		this.location = location;
		this.time = time;
		this.slotNo = slotNo;
		this.hour = hour;
		Type = type;
		this.vehicleNo = vehicleNo;
		this.userId = userId;
		this.userName = userName;
		this.totalPrice = totalPrice;
	}

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

<<<<<<< HEAD
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Date getDate() {
=======
	public LocalDate getDate() {
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
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

<<<<<<< HEAD
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
=======
	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
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
<<<<<<< HEAD
	
	


=======

	
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
	
}
