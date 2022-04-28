package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Entity;


@RestController
public class BajajApiController 
{

	@Autowired
	public Entity user;
	
	@PostMapping("/bfhl")
	  public Entity createUser(@RequestBody Entity us) {
		if(us != null)
		{
		user.setIs_success(true);
		user.setEmail("john@xyz.com");
		user.setUser_id("john_doe_17091999");
		user.setRoll_number("ABCD123");
		
		user.setNumbers(us.getNumbers());
		user.setAlphabets(us.getAlphabets());
		
		}
	    return (user);
	  }
	
}
