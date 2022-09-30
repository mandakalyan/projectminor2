package com.api.swagger.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders 
{
	@Id
	private int ordId;
	private String ordDate;
	private String ordQty;
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public String getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(String ordDate) {
		this.ordDate = ordDate;
	}
	public String getOrdQty() {
		return ordQty;
	}
	public void setOrdQty(String ordQty) {
		this.ordQty = ordQty;
	}
	public Orders(int ordId, String ordDate, String ordQty) {
		super();
		this.ordId = ordId;
		this.ordDate = ordDate;
		this.ordQty = ordQty;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordDate=" + ordDate + ", ordQty=" + ordQty + "]";
	}
	
	

}
