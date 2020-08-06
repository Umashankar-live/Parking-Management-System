package com.example.application.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SR.No")
	private int srno;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Two_Wheeler_Slots")
	private int twoWheelerTotal;
	
	@Column(name="Two_Wheeler_Available_Slots")
	private int twoWheelerAvailable;
	
	@Column(name="Four_Wheeler_Slots")
	private int fourWheelerTotal;
	
	@Column(name="Four_Wheeler_Available_Slots")
	private int fourWheelerAvailable;

	public Parking(int srno, String location, int twoWheelerTotal, int twoWheelerAvailable, int fourWheelerTotal,
			int fourWheelerAvailable) {
		super();
		this.srno = srno;
		this.location = location;
		this.twoWheelerTotal = twoWheelerTotal;
		this.twoWheelerAvailable = twoWheelerAvailable;
		this.fourWheelerTotal = fourWheelerTotal;
		this.fourWheelerAvailable = fourWheelerAvailable;
	}
	
	public Parking() {}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTwoWheelerTotal() {
		return twoWheelerTotal;
	}

	public void setTwoWheelerTotal(int twoWheelerTotal) {
		this.twoWheelerTotal = twoWheelerTotal;
	}

	public int getTwoWheelerAvailable() {
		return twoWheelerAvailable;
	}

	public void setTwoWheelerAvailable(int twoWheelerAvailable) {
		this.twoWheelerAvailable = twoWheelerAvailable;
	}

	public int getFourWheelerTotal() {
		return fourWheelerTotal;
	}

	public void setFourWheelerTotal(int fourWheelerTotal) {
		this.fourWheelerTotal = fourWheelerTotal;
	}

	public int getFourWheelerAvailable() {
		return fourWheelerAvailable;
	}

	public void setFourWheelerAvailable(int fourWheelerAvailable) {
		this.fourWheelerAvailable = fourWheelerAvailable;
	}
	
	
	
	
}
