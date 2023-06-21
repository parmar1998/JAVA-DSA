package com.cn.Multithreading;

/*
 * Ways to create Thread - Extend Thread class/Implement Runnable Interface
 * 
 */

class Demo extends Thread{
	/*
	 * MultiPle Inheritance is not possible so interface Runnable is Helpful.
	 */
	public void run() {
		System.out.println("Class created extending thread class");
	}
}

public class TutorialInfy {
	public static void main(String[] args) {
//		Thread thread = Thread.currentThread();
//		System.out.println("Name of Thread: "+thread.getName());
		
//		Demo obj=new Demo();
//		obj.start();
		
		Runnable obj1=()->System.out.println("Thread Created Using Runnable Interface");
		
		Thread thread=new Thread(obj1);
		thread.start();
		//Illegal threadexception will be thrown - Sleep method can be used here
//		thread.start();
		
		new Thread(()->{
			System.out.println("Going to Sleep");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}).start();
		
		
	}

}
