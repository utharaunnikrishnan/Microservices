package com.ofss;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	List<Customer> allCustomers=new ArrayList();
	
	@Autowired
	
	CustomerService cs;
	
    @RequestMapping(value="/customers",method=RequestMethod.GET)
	public List<Customer> getAllCustomers()
	{
 
		return cs.getAllCustomers();
	}
    
    @RequestMapping(value="/customers/{custId}",method=RequestMethod.GET)
    public Customer getAcustomer(@PathVariable("custId") int cid) 
    	{
    	
    		return cs.getACustomer(cid);
    		}
    
    @RequestMapping(value="/customers/{custId}",method=RequestMethod.DELETE)
    public boolean deleteACustomer(@PathVariable("custId") int cid) 
    	{
    	
    		return cs.deleteACustomer(cid);
    		}
    
    @RequestMapping(value="/customers/add",method=RequestMethod.POST)
    public String addACustomer(@RequestBody Customer cust) 
    	{
    	
    		return cs.addACustomer(cust);
    		}
}


