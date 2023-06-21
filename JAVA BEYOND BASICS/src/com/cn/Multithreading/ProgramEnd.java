package com.cn.Multithreading;

public class ProgramEnd {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			Thread t1 = Thread.currentThread();
			System.out.println(t1.getName() + " " + "Starts");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(t1.getName() + " Ended");
		};
		var t1 = new Thread(r1);
		Runnable r2 = () -> {
			Thread t2 = Thread.currentThread();
			System.out.println(t2.getName() + " " + "Starts");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(t2.getName() + " Ended");
		};
		var t2 = new Thread(r2);
		t1.start();
		//join will take care of thread start and ends 
		try {
			t1.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		t2.start();
	}
}
