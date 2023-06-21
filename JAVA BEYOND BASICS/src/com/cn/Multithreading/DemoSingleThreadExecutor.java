package com.cn.Multithreading;


import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoSingleThreadExecutor {
	public static void main(String[] args) {
//		ExecutorService ex=Executors.newSingleThreadExecutor();
		ScheduledExecutorService ex=Executors.newSingleThreadScheduledExecutor();
		System.out.println("Start Time"+LocalTime.now());
		Runnable task1=()->System.out.println("Running task 1..."+Thread.currentThread().getName());
		Runnable task2=()->System.out.println("Running task 2..."+Thread.currentThread().getName());
		Runnable task3=()->System.out.println("Running task 3..."+Thread.currentThread().getName());
		ex.schedule(task1,10,TimeUnit.SECONDS);
		ex.schedule(task2,20,TimeUnit.SECONDS);
		ex.schedule(task3,30,TimeUnit.SECONDS);
		ex.shutdown();//accepting new task - will throw rejected execution
		
	}
}
