package com.study.java8features;

interface Phone
{
	void Call();
	
	//JAVA 8 Feature
	default void Message() {
		System.out.println("messaging");
	}
}
class AndroidPhone implements Phone{

	@Override
	public void Call() {
		System.out.println("Calling");
		
	}
	
}
public class Demointerface {

	public static void main(String[] args) {
		Phone p=new AndroidPhone();
		p.Call();
		p.Message();
	}
}
