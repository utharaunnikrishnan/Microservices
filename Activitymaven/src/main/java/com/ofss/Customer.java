package com.ofss;

public class Customer {
	
	int custId;
	String custName;
	String custLocation;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, String custLocation) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custLocation = custLocation;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustLocation() {
		return custLocation;
	}

	public void setCustLocation(String custLocation) {
		this.custLocation = custLocation;
	}
	
	
	
}
