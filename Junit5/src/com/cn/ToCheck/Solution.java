package com.cn.ToCheck;

import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) {
		Stream<Integer> in = Stream.of(8, 7, 10, 15, 20, 22, 30);
		System.out.println(in.filter((n) -> n % 5 == 0).count());
	}
}
