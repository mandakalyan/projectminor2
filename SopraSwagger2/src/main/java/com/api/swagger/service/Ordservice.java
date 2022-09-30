package com.api.swagger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.swagger.entity.Orders;
import com.api.swagger.repository.OrderResp;

@Service
public class Ordservice
{
	@Autowired
	private OrderResp serviceRepo;
	public List<Orders>getAllOrders()
	{
		List<Orders> list=new ArrayList<Orders>();
		this.serviceRepo.findAll().forEach(list::add);
		return list;
	}
	public void addorders(Orders orders) 
	{
		
		this.serviceRepo.save(orders);
	}

}
