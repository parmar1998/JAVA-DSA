package com.cn.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<>();
		Product p1 = new Product("Monitor", 26000, 2, "Dell");
		Product p2 = new Product("KeyBoard", 999, 2, "Dell");
		Product p3 = new Product("Charger", 1800, 2, "Zebronics");
		Product p4 = new Product("Mouse", 600, 2, "HP");
		prodList.add(p4);
		prodList.add(p3);
		prodList.add(p2);
		prodList.add(p1);
		// use of stream
		prodList.stream().filter(p -> p.getPrice() < 1000)
				.sorted((a1, a2) -> a2.getProductName().compareTo(a1.getProductName())).forEach(System.out::println);

		//As per the termination it will print the output if no termination is present it will print the address
		Stream<Integer> inStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		inStream.filter(num -> num % 2 != 0).map(num -> num * 3).forEach(num -> System.out.print(num + " "));

	}
}
