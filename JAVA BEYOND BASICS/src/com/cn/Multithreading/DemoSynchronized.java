package com.cn.Multithreading;

public class DemoSynchronized {
	private int balance = 2000;
	
	public  void  deposit(int amount) {
//	public synchronized void  deposit(int amount) {
		System.out.println("Initial "+balance);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		balance=balance+amount;
		System.out.println("Final "+balance);
	}

	public static void main(String[] args) {
		DemoSynchronized obj=new DemoSynchronized();
		Runnable r1=()->obj.deposit(1000);
		Runnable r2=()->obj.deposit(1000);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}
}
