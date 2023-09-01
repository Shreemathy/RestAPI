package com.exer.day6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChildEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int babyid;
	private String fname;
	private String lname;
	private String fathername;
	private String mothername;
	private String address;
	public ChildEntity(String address) {
		super();
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBabyid() {
		return babyid;
	}
	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public ChildEntity(int babyid, String fname, String lname, String fathername, String mothername) {
		super();
		this.babyid = babyid;
		this.fname = fname;
		this.lname = lname;
		this.fathername = fathername;
		this.mothername = mothername;
	}
	public ChildEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
