package text;

public class nintyNineBottles {

	public static void main(String[] args)
	{
		for (int i = 99; i >= 0; i--)
		{
			if (i == 1)
			{
				System.out.println(i + " bottle of pop on the wall.");
				System.out.println(i + " bottle of pop.");
			} else
			{
				System.out.println(i + " bottles of pop on the wall.");
				System.out.println(i + " bottles of pop.");
			}
			if(i == 1)
				System.out.println("Take it down pass it around,");
			else if(i == 0);
			else
				System.out.println("Take one down pass it around,");
			if (i == 2)
				System.out.println(i - 1 + " bottle of pop on the wall.");
			else if (i == 0)
				System.out.println("No more bottles of pop on the wall.");
			else
				System.out.println(i - 1 + " bottles of pop on the wall.");
			System.out.println();
		}
	}
}
