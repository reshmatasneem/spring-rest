package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")//start listening
	public Greeting greeting(@RequestParam(defaultValue="World")String name)
	{
		//String response ="Hello "+ name;
		Greeting response = new Greeting(name);
		return response;
		
	}
}
