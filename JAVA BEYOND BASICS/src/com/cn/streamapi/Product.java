package com.cn.streamapi;

public class Product {
	String ProductName;
	int price;
	int qty;
	String Seller;

	public Product(String productName, int price, int qty, String seller) {
		ProductName = productName;
		this.price = price;
		this.qty = qty;
		Seller = seller;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getSeller() {
		return Seller;
	}

	public void setSeller(String seller) {
		Seller = seller;
	}

}
