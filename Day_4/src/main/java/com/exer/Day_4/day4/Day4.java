package com.exer.Day_4.day4;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Day4 {
	@Id
	private int id;
	private String name;
	private String dept;
	private String mail;
	
	public Day4() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Day4(int id, String name, String dept, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.mail = mail;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


	
	

}
