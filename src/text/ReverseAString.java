package text;
/**
 * A program to reverse a String.
 * @author Cameron Pickle
 *
 */
public class ReverseAString {

	public static void main(String args[]) 
	{
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "Hello World!";
		System.out.println(s1+" reversed is "+reverse(s1));
		System.out.println(s2+" reversed is "+reverse(s2));
		System.out.println(s3+" reversed is "+reverse(s3));
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
