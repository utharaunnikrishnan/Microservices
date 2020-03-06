package com.example.CustomerMicroservice;

import java.util.ArrayList;

public class Customer {
	
	int ID;
	String name;
	String address;
	long pincode;
	int stockId;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Customer(int id,String name,String address,long pincode,int stockId) {
		this.ID=id;
		this.name=name;
		this.address=address;
		this.pincode=pincode;
		this.stockId=stockId;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public int getstockId() {
		return stockId;
	}
	public void setstockIds(int stockId) {
		this.stockId=stockId;
	}

}
