package com.exer.Day_5.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	private int id;
	private String bname;
	private float bprice;
	private int quantity;
	private String authorname;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String bname, float bprice, int quantity, String authorname) {
		super();
		this.id = id;
		this.bname = bname;
		this.bprice = bprice;
		this.quantity = quantity;
		this.authorname = authorname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
	
	}
