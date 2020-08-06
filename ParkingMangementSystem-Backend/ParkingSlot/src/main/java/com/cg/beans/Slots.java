package com.cg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Slots {
	
	@Id
<<<<<<< HEAD:ParkingMangementSystem-Backend/ParkingSlot/src/main/java/com/example/application/beans/Slots.java
	@GeneratedValue(strategy = GenerationType.AUTO)
=======
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
>>>>>>> a4cc817efab8b8447371080431b33ce9401a8756:ParkingMangementSystem-Backend/ParkingSlot/src/main/java/com/cg/beans/Slots.java
	private int srNo;
	private int slots;
	
	private String location;
	
	private int type;
	private boolean status ;

	public Slots() {
	}

	public Slots(int srNo, int slots, String location, int type, boolean status) {
		super();
		this.srNo = srNo;
		this.slots = slots;
		this.location = location;
		this.type = type;
		this.status = status;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	
}