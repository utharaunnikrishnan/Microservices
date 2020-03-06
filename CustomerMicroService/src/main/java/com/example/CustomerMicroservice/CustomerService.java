package com.example.CustomerMicroservice;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	

	List<Customer> allCustomers=new ArrayList();
	
	public List<Customer> getAllCustomers()
	{
		Customer c1=new Customer(1, "Guru", "Bangalore",686767,2);
		Customer c2=new Customer(2, "Jack", "Mangalore",876899,1);
		Customer c3=new Customer(3, "Peter", "Chennai",887689,3);
		Customer c4=new Customer(4, "Hari", "Pune",67899,3);
		Customer c5=new Customer(5, "Dhruv", "Mumbai",86679,1);
		
		allCustomers.add(c1);
		allCustomers.add(c2);
		allCustomers.add(c3);
		allCustomers.add(c4);
		allCustomers.add(c5);
		return allCustomers;
		
	}
	

	public Customer getACustomer(int cid)
	{
		System.out.println("Service: Accepting the customer id "+cid);
		
		// write the logic to find out the customer obj for the given custid
		Customer c=new Customer(); // empty customer object
		
		for (Customer custTemp:allCustomers)
		{
			if (custTemp.getID()==cid)
			{
				c=custTemp;
				break;
				
			}
		}
		
		
		return c; // customer object matching the cust id
		
	}
	
	public boolean deleteACustomer(int cid)
	{
		System.out.println("Service: Accepting the customer id "+cid);
		boolean isDeleted=false;
		// write the logic to find out the customer obj for the given custid
		Customer c=new Customer(); // empty customer object
		
		for (Customer custTemp:allCustomers)
		{
			if (custTemp.getID()==cid)
			{
				c=custTemp;
				allCustomers.remove(custTemp);
				isDeleted=true;
				break;
				
			}
		}
		
		
		return isDeleted;
		
	}
	
	public String addACustomer(Customer customer)
	{
		allCustomers.add(customer);
		return customer.getName()+" added succesfully";
		
	}

	
}
