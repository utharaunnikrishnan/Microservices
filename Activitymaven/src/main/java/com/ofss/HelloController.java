package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	HelloService service;
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String m1()
	{
		System.out.println("In controller");
		return service.display();
	}

	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public String m2()
	{
		return"WELCOME";
	}
}
