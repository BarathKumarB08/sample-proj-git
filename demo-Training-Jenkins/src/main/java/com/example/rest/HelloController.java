package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello Rest World";
	}
	
	/*
	 * @RequestMapping(produces = MediaType.APPLICATION_XML,
	 * method=RequestMethod.GET, value="/details")
	 * 
	 * @ResponseBody public Customer details() { Customer c1 = new Customer();
	 * c1.setId(101); c1.setName("Barath"); c1.setAddress("India");
	 * 
	 * return c1; }
	 */

}
