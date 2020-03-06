package com.example.StockMicroservice;

public class Stock {
	int stockID;
	String name;
	float price;
	
	public Stock() {
		super();
		
	}
	
	public Stock(int stockID, String name,float price) {
		this.stockID=stockID;
		this.name=name;
		this.price=price;
	}
	
	public int getstockID() {
		return stockID;
	}
	public void setID(int stockID) {
		this.stockID = stockID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
