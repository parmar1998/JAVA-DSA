package com.cn.Multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoConcurrentCollection {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>(Arrays.asList(1,2,3));
		Iterator<Integer> itr=lst.iterator();
		new Thread(()->{
			while(itr.hasNext()) {
				lst.add(5);
				itr.next();
			}
			lst.forEach(System.out::println);
		}).start();
	}
}
