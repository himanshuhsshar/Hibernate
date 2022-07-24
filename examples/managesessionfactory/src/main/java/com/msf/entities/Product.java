package com.msf.entities;

import java.io.Serializable;

public class Product implements Serializable{
	protected int productNo;
	protected String productName;
	protected String description;
	protected double price;
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getProductNo() {
		return productNo;
	}
	public String getProductName() {
		return productName;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	

}
