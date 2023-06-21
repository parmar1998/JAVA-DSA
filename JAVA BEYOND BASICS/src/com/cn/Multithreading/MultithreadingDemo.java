package com.cn.Multithreading;

/*
 * Multithreading is a programming concept in which the application can create a 
 * small unit of tasks to execute in parallel. If you are working on a computer, 
 * it runs multiple applications and allocates processing power to them. A simple
 * program runs in sequence and the code statements execute one by one. This is a 
 * single-threaded application. But, if the programming language supports creating
 * multiple threads and passes them to the operating system to run in parallel, 
 * it’s called multithreading.
 *   
 * Java supports multithreading through Thread class.
 * There are two types of threads in an application - user thread and daemon thread.
 * We can create Threads by either implementing Runnable interface or by extending Thread Class.
 */
class MyThread11 extends Thread {
	public void run() {
		System.out.println("Thread 1 is running");
	}
}

class MyThread2 extends Thread {
	public void show() {
		System.out.println("Thread 2");
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		MyThread11 myThread1 = new MyThread11();
		MyThread2 myThread2 = new MyThread2();
		myThread1.start();
		myThread2.show();
	}
}
