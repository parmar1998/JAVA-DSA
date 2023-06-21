package com.cn.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoCachedPool {
	public static void main(String[] args) {
		ExecutorService ses=Executors.newCachedThreadPool();
		Runnable task1=()->System.out.println("Running task 1..."+Thread.currentThread().getName());
		Runnable task2=()->System.out.println("Running task 2..."+Thread.currentThread().getName());
		Runnable task3=()->System.out.println("Running task 3..."+Thread.currentThread().getName());
		ses.execute(task1);
		ses.execute(task2);
		try {
			Thread.sleep(7000);
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		ses.execute(task3);
		ses.shutdown();
	}
}
