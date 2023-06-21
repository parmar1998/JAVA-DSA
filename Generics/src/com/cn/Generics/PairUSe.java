package com.cn.Generics;

public class PairUSe {
	public static void main(String[] args) {
	
		Pair<String> p1=new Pair<String>("abc", "def");
		System.out.println(p1.getFirst()+p1.getSecond());
		
		
		Pair<Integer> p2=new Pair<Integer>(1, 2);
		System.out.println(p2.getFirst()+p2.getSecond());
	}
}
