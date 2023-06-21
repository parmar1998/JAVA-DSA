package com.cn.lambdaExpression;

import java.util.Arrays;
import java.util.List;

class Product {
	int ID;
	int price;
	String name;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Product(int iD, int price, String name) {
		this.ID = iD;
		this.price = price;
		this.name = name;
	}

}

class Predicate {
	public static void main(String[] args) {
		Product p1=new Product(1001,1200, "Frock");
		Product p2=new Product(1002,6000, "Tailo");
		Product p3=new Product(1003,400, "mango");
		Product p4=new Product(1004,670, "shirt");
		List<Product> lst=Arrays.asList(p1,p2,p3,p4);
		evaluate(lst, p->p.price<500);
	}
	public static void evaluate(List<Product> list,java.util.function.Predicate<Product> predicate) {
		for(Product id:list) {
			if(predicate.test(id))
				System.out.println(id.getName());
		}
	}
}
