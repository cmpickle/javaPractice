package text;

public class Palindrome {

	public static void main(String[] Args)
	{
		String s1 = "racecar";
		String s2 = "hello";
		String s3 = "you uoy";
		String s4 = "!ollo!";
		
		System.out.println("Is the word " + s1 + " a palindrome? " + isPalindrome(s1));
		System.out.println("Is the word " + s2 + " a palindrome? " + isPalindrome(s2));
		System.out.println("Is the word " + s3 + " a palindrome? " + isPalindrome(s3));
		System.out.println("Is the word " + s4 + " a palindrome? " + isPalindrome(s4));
	}
	
	/**
	 * Checks if the inputed string is a palindrome.
	 * @param input
	 * 		--The string to be checked
	 * @return
	 * 		--True if a palindrome else false
	 */
	public static boolean isPalindrome(String input)
	{
		if(input.equals(reverse(input)))
			return true;
		return false;
	}
	
	/**
	 * Reverses any given string.
	 * @param input
	 * 		--String to be reversed.
	 * @return
	 * 		--reverse of the string.
	 */
	public static String reverse(String input)
	{
		String temp = "";
		for (int i = input.length()-1; i >= 0; i--)
		{
			temp += input.charAt(i);
		}
		return temp;
	}
}
