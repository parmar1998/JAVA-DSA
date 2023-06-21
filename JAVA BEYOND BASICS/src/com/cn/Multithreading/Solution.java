package com.cn.Multithreading;

class Mythread1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			//print statement whenever run is called
			System.out.println("Thread 1");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
		}
	}
}

class Mythread22 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			//print statement whenever run is called
			System.out.println("Thread 2");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
		}
	}
}
public class Solution {
public static void main(String[] args) {
	Runnable obj1=new Mythread1();
	Runnable obj2=new Mythread22();
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t1.start();
	t2.start();
}
}
