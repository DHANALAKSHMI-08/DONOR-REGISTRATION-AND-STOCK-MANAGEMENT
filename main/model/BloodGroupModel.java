package com.cts.blood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BloodGroupModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String type;
    private int units;
    
    
    public BloodGroupModel() {}

    public BloodGroupModel(String type) {
        this.type = type;
        this.units = 0;
    }

    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	
	
	@Override
	public String toString() {
		return "BloodGroupModel [id=" + id + ", type=" + type + ", units=" + units + "]";
	}
	
	
    
    
}
