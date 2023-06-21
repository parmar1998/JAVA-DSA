package com.cn.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	//availabe set of threadpool for performing task
public static void main(String[] args) {
	//no of thread pool required to create inside the thread pool
	ExecutorService ses=Executors.newFixedThreadPool(2);
	Runnable task1=()->System.out.println("Running task 1..."+Thread.currentThread().getName());
	Runnable task2=()->System.out.println("Running task 2..."+Thread.currentThread().getName());
	Runnable task3=()->System.out.println("Running task 3..."+Thread.currentThread().getName());
	ses.execute(task1);
	ses.execute(task2);
	ses.execute(task3);
	ses.shutdown();
}
}
