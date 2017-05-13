package numbers;

public class Incrementation {

	public static void main(String[] Args)
	{
		int x = 1, y = 1, z = 1;
		String[] arr = {"one", "two", "three"};
		System.out.println("++x = " + ++x);
		System.out.println("y++ = " + y++);
		System.out.println("arr[z++] = " + arr[z++]);
		
		System.out.println();

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("arr[z] = " + arr[z]);
	}
}
