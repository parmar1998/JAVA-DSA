package com.study.java8features;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(4,5,6,7,8,9);
		
		//Old method
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println();
		//this is enhanced for each method in java - External loop
		for(int i:l1) {
			System.out.print(i+" ");
		}
		System.out.println();
		//for each method in java 8 also called internal loop
		l1.forEach(i->System.out.print(i+" "));//lambda expression
	}
}
