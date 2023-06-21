package ThreadApp1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {
	public static void main(String[] args) {

//		System.out.println(thread.getName());// Thread-0
		SecondDemo s = new SecondDemo();
		Thread thread = new Thread(s);
		thread.start();

//		If using only lambda expression
		Runnable runnable = () -> System.out.println("Thread using lambda");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Thread th = new Thread(runnable);
		th.start();
	}
}
