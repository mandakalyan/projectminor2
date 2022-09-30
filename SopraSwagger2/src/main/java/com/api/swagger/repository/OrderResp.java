package com.api.swagger.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.swagger.entity.Orders;

public interface OrderResp extends CrudRepository<Orders, Integer> 
{

}
