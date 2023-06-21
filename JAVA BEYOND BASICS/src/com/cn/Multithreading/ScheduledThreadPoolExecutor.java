package com.cn.Multithreading;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor {
	public static void main(String[] args) {
		ScheduledExecutorService ses=Executors.newScheduledThreadPool(2);
		Runnable task1=()->System.out.println("Running task 1..."+Thread.currentThread().getName()+" "+LocalTime.now());
		Runnable task2=()->System.out.println("Running task 2..."+Thread.currentThread().getName()+" "+LocalTime.now());
		Runnable task3=()->System.out.println("Running task 3..."+Thread.currentThread().getName()+" "+LocalTime.now());
		ses.schedule(task1, 10, TimeUnit.SECONDS);
		ses.schedule(task2, 20, TimeUnit.SECONDS);
		ses.schedule(task3, 30, TimeUnit.SECONDS);
		ses.shutdown();
		
	}
}
