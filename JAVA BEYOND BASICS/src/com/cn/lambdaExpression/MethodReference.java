package com.cn.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<String> productList=Arrays.asList("Frock","Watch","Shirt");
		productList.sort(String::compareTo);
		for(String name:productList) {
			System.out.println(name);
		}
	}
}
