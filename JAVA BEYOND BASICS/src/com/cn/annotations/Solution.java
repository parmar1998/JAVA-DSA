package com.cn.annotations;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface sample{
	public void getname();
}

@FirstCustomAnnotation(author_name="ram",bookType="maths")
class A{
	
}
class B extends A{
	
}
public class Solution {

	@Deprecated
	public static int update(int a,int b) {
		return a*b;
	}
	@SuppressWarnings("unused")
	public static int sum(int a,int b) {
		int c=30;//unused variable
		return a+b;	
	}
	
	@SafeVarargs
	private final void Display(List<String>...products) {
		for(List<String> product:products) {
			System.out.print(product);
		}
	}
	public static void main(String[] args) {
		Solution s=new Solution();
		List<String> list=new ArrayList<>();
		list.add("Laptop");
		list.add("Tablet");
		s.Display(list);
	}
}
