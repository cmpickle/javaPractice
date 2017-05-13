package errors;

public class StackOverflowTest {
	
	public static void main(String[] args)
	{
		bringTheRain();
	}
	
	public static void bringTheRain()
	{
		bringTheRain();
	}
}
