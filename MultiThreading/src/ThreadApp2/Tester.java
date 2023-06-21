package ThreadApp2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tester {
	/*
	 * A Java Call able interface uses Generics, thus making it possible to return
	 * any type of object. The Executor Framework gives a submit () method to
	 * execute Call able implementations in a pool of threads. In reality, the Java
	 * Executor Framework adheres to the WorkerThread patterns
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Callable<Double> callable = new PriceCalculator();
		Future<Double> future = executorService.submit(callable);
		System.out.println(future.get());
	}
}
