package com.api.swagger.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.swagger.entity.Orders;
import com.api.swagger.service.Ordservice;

@RestController
@RequestMapping("/rest/orders")
public class Controller 
{
	@Autowired
	private Ordservice service;
	@GetMapping("/orders")
	public List<Orders>getAllOrders()
	{
		return service.getAllOrders();
	}
	@PostMapping("/addorders")
	public void addorders(@RequestBody Orders orders)
	{
		this.service.addorders(orders);
	}
	@GetMapping
	public String hello()
	{
		return "Hello";
	}
	@PostMapping("/hello")
	public String helloPost(@RequestBody final String hello)
	{
		return hello;
	}
	@PutMapping 
	public String helloPut(@RequestBody final String hello)
	{
		return hello;
	}

	
	
	
	

}
