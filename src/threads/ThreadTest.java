package threads;

public class ThreadTest {
	public static void main(String[] args)
	{
		Thread myThread = new MyThread();
		
		myThread.start();
	}
	
	public static class MyThread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello World");
		}
	}
}
