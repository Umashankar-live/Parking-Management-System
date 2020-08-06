package com.cg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Slots {
	
	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int slotId;
	
=======
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int srNo;
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
	private int slots;
	
	private String location;
	
	private int type;
	private boolean status ;

	public Slots() {
	}

	public Slots(int slotId, int slots, String location, int type, boolean status) {
		super();
		this.slotId = slotId;
		this.slots = slots;
		this.location = location;
		this.type = type;
		this.status = status;
	}

	public int getslotId() {
		return slotId;
	}

	public void setslotId(int slotId) {
		this.slotId = slotId;
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

	
	@Override
	public String toString() {
		return "Slots [slotId=" + slotId + ", slots=" + slots + ", location=" + location + ", type=" + type
				+ ", status=" + status + "]";
	}
	
	

	
	
	
	
}