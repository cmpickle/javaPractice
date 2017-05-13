package numbers;

public class squareSummation {

	public static void main(String[] Args)
	{
		int sum = 0;
		for(int i=1;i<=20;i++)
			sum += (i+1)*(i+1) - i*i;
		System.out.println(sum);
	}
}