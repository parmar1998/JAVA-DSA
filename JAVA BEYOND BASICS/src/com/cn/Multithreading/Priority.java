package com.cn.Multithreading;

public class Priority {
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println();
		Thread t1 = new Thread(r1);
		Runnable r2 = () -> System.out.println();
		Thread t2 = new Thread(r2);
		
		t2.setPriority(1);
		t1.setPriority(9);
		
		t2.start();
		System.out.println("Thread 2 Priority "+t2.getPriority());
		
		t1.start();
		System.out.println("Thread 1 Priority "+t1.getPriority());
		
	}

}
