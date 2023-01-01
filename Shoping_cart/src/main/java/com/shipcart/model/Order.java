package com.shipcart.model;

public class Order extends Product {
  private int ordedrId;
  private int uId;
  private int quantity;
  private String date;
  
  
  public Order() {
	  
  }


public Order(int ordedrId, int uId, int quantity, String date) {
	this.ordedrId = ordedrId;
	this.uId = uId;
	this.quantity = quantity;
	this.date = date;
}


public Order(int uId, int quantity, String date) {
	
	this.uId = uId;
	this.quantity = quantity;
	this.date = date;
}


public int getOrdedrId() {
	return ordedrId;
}


public void setOrdedrId(int ordedrId) {
	this.ordedrId = ordedrId;
}


public int getuId() {
	return uId;
}


public void setuId(int uId) {
	this.uId = uId;
}


public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public String getDate() {
	return date;
}


public void setDate(String date) {
	this.date = date;
}


@Override
public String toString() {
	return "Order [ordedrId=" + ordedrId + ", uId=" + uId + ", quantity=" + quantity + ", date=" + date + "]";
}


  
  
  
}
