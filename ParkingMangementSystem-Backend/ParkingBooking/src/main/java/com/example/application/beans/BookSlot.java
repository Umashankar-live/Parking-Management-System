package com.example.application.beans;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int srNo;
	
	private int bookingId;
	
	private Date date;
	
	private Time time;
	
	private int hour;
	
	@Column(name="2_Wheeler = 2, 4_Wheeler = 4")
	private int Type;
	
	private String vehicleNo;
	
	private int TotalPrice;
	
	public BookSlot() {}
	
	
	
	
	
}
