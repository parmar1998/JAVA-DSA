package com.cn.WrapperClass;

public class Solution {

	public static void main(String[] args) {
		Integer i=new Integer(3);
		int j;
		j=i;
		//Boxing is the process of converting a primitive data type to its corresponding wrapper class. 
		i=j;//Unboxing, on the other hand, is the process of converting a wrapper class object to its corresponding primitive data type
		System.out.print(i.toString());
		
		Integer obj = Integer.valueOf(10);
		int num = obj.intValue(); // unboxing
		
		int num1 = 10;
		Integer obj1 = Integer.valueOf(num1); // boxing
	}
	
}
