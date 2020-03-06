package com.example.StockMicroservice;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service

public class StockService {
	

		List<Stock> allStocks=new ArrayList();
		
		public List<Stock> getAllStocks()
		{
			Stock s1=new Stock(1,"Infy",789);
			Stock s2=new Stock(2,"wipro",900);
			Stock s3=new Stock(3,"cts",1000);
			Stock s4=new Stock(4,"tcs",2000);
			
	
			allStocks.add(s1);
			allStocks.add(s2);
			allStocks.add(s3);
			allStocks.add(s4);
			
			return allStocks;
				
		}
		

		public Stock getAStock(String name)
		{

			Stock s=new Stock(); // empty customer object
			
			for (Stock stockTemp:allStocks)
			{
				if (stockTemp.getName()==name)
				{
					s=stockTemp;
					break;
					
				}
			}
			
			
			return s; 
		}
		
		


}
