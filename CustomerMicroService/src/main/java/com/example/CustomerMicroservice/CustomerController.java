package com.example.CustomerMicroservice;

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
		
		RemoteStockRepository remoteStockRepository;
		
		CustomerService cs;
		
		@RequestMapping(value="/customers/{customerid}/stocks",method=RequestMethod.GET)
		public List<Stock> getCustomerStocks(@PathVariable(value="customerid") int customerid)
		{
			System.out.println("Entering getCustomerStocks");
			List<Stock> allStocks=new ArrayList();
			Customer cust=null;
			
			for (Customer c:allCustomers)
			{
				if (c.getID()==customerid)
				{
					cust=c;
				}
					
			}
			int stockIds[]=cust.getstockID();
			
			
			for (int i=0;i<stockIds.length;i++)
			{
			Stock stock=remoteStockRepository.getStock(stockIds[i]);
			allStocks.add(stock);
			}
			return allStocks;
			
			
		}
		
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




