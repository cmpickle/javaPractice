package threads;

public class ThreadRunnable {
	public static void main(String[] args)
	{
		Thread myThread = new Thread(new MyRunnable());
		
		myThread.start();
	}
	
	public static class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("Hello World Runnable");
		}
	}
}
