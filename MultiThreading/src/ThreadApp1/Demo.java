package ThreadApp1;

public class Demo extends Thread {

	public void run() {
		System.out.println("Thread Created");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.start();
	}
}
