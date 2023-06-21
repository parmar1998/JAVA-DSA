package com.cn.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter implements Runnable {
	static volatile int count = 10;//when we don't use volatile inconsistent data we be shown 

	@Override
	public void run() {
		System.out.println("Initial value of count by:" + Thread.currentThread().getName() + ":" + count);
		count++;
		System.out.println("Final value of count by:" + Thread.currentThread().getName() + "at" + count);
	}
}

public class DemoVolatile {
	public static void main(String[] args) {
		Counter c=new Counter();
		ExecutorService executor=Executors.newFixedThreadPool(3);
		executor.execute(c);
		executor.execute(c);
		executor.execute(c);
		executor.execute(c);
	}
}
