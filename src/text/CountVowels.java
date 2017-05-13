package text;

/**
 * A program to count the number of vowels in a String.
 * 
 * @author Cameron Pickle
 *
 */
public class CountVowels {

	private static int sum = 0;
	private static int aCount = 0;
	private static int eCount = 0;
	private static int iCount = 0;
	private static int oCount = 0;
	private static int uCount = 0;
	
	public static void main(String[] Args)
	{
	String s1 = "Hello World!";
	
	countVowel(s1);
	}
	
	/**
	 * Takes in a string and prints out to the console the number of vowels and the number of instances of each one. 
	 * Also returns the sum of the vowels as an int.
	 * @param input
	 * 		-- the string to be analyzed
	 * @return
	 * 		-- the number of vowels in the string as an int
	 */
	public static int countVowel(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == 'a' || input.charAt(i) == 'A')
			{
				sum++;
				aCount++;
			}else if(input.charAt(i) == 'e' || input.charAt(i) == 'E')
			{
				sum++;
				eCount++;
			}else if(input.charAt(i) == 'i' || input.charAt(i) == 'I')
			{
				sum++;
				iCount++;
			}else if(input.charAt(i) == 'o' || input.charAt(i) == 'O')
			{
				sum++;
				oCount++;
			}else if(input.charAt(i) == 'u' || input.charAt(i) == 'U')
			{
				sum++;
				uCount++;
			}
		}
		System.out.println("There are " + sum + " vowels in " + input + ".");
		System.out.println("There are " + aCount + " a's in " + input + ".");
		System.out.println("There are " + eCount + " e's in " + input + ".");
		System.out.println("There are " + iCount + " i's in " + input + ".");
		System.out.println("There are " + oCount + " o's in " + input + ".");
		System.out.println("There are " + uCount + " u's in " + input + ".");
		return sum;	
	}
}
