package com.example.StockMicroservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StockController {

	
		List<Stock> allStocks=new ArrayList();
		
		@Autowired
		
		StockService ss;
		
	    @RequestMapping(value="/stocks",method=RequestMethod.GET)
		public List<Stock> getAllStocks()
		{
	 
			return ss.getAllStocks();
		}
	    
	    @RequestMapping(value="/Stocks/{name}",method=RequestMethod.GET)
	    public Stock getAStock(@PathVariable("name") String name) 
	    	{
	    	
	    		return ss.getAStock(name);
	    		}
	    

	}






	
	
