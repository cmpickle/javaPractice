package numbers;

public class MathHW {

	public static void main(String[] args)
	{
		double result = 0;
		double start = .875;
		for (int i = 1; i < 9999; i++)
		{
			result += power(start, i - 1);

		}
		System.out.println(result);
	}

	public static double power(double in, int exp)
	{
		if (exp == 0)
			return 1;
		double result = in;
		for (int i = 1; i < exp; i++)
			result *= in;
		return result;
	}
}
