package com.exer.day7.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CarEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carid;
	private String carname;
	private String cartype;
	private String owners;
	private String currentownername;
	private long mobile;
	private String address;
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public String getCurrentownername() {
		return currentownername;
	}
	public void setCurrentownername(String currentownername) {
		this.currentownername = currentownername;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CarEntity(int carid, String carname, String cartype, String owners, String currentownername, long mobile,
			String address) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.cartype = cartype;
		this.owners = owners;
		this.currentownername = currentownername;
		this.mobile = mobile;
		this.address = address;
	}
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
