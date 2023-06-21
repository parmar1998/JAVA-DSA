package com.cn.Multithreading;

public class Demo6 {
public static void main(String[] args) {
	Runnable r=()->{
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
	};
	Thread t=new Thread(r);
//	t.setName("Child");
	t.start();
}
}
