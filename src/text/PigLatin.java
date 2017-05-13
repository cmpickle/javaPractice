package text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A program that converts normal Strings to Pig Latin.
 * @author Cameron Pickle
 *
 */
public class PigLatin {

	private static String pigLatin = "ay";
	
	public static void main(String[] Args)
	{
		System.out.println(pigLatin("PigLatin.txt"));
//		System.out.println(pigLatin("Neal I can see you!"));
	}
	
	/**
	 * Returns a string that has been translated to Pig Latin.
	 * 
	 * Assumes that the string starts with a letter. if not returns the string.
	 * 
	 * If the string ends with punctuation it will be appropriately appended to the end.
	 * @param input
	 * @return
	 */
	public static String pigLatin(String input) 
	{
		boolean notFoundFlag = false;
		Scanner s = null;
		
		try {
			File scanMe = new File(input);
			
			try {
				s = new Scanner(scanMe);
			} catch (FileNotFoundException e) {
				notFoundFlag = true;
				//e.printStackTrace();
			}
		} finally {
			
		}
		
		if(!notFoundFlag)
		{
			String temp = "";
			String finish = "";
			while(s.hasNextLine())
			{
				temp = s.nextLine();
				
				String[] words = temp.split(" ");
				
				for(int i=0;i<words.length;i++)
					words[i] = convert(words[i]);
				
				for(int i=0;i<words.length;i++)
					finish += words[i] + " ";
				
				finish += "\n";
			}
			
			s.close();
			
			return finish.toLowerCase();
		}
		String temp = "";
		String[] words = input.split(" ");
		
		for(int i=0;i<words.length;i++)
			words[i] = convert(words[i]);
		
		for(int i=0;i<words.length-1;i++)
			temp += words[i] + " ";
		
		temp+=words[words.length-1];
		
		return temp.toLowerCase();
	}
	
	/**
	 * Converts a single word string into Pig Latin.
	 * 
	 * Punctuation is kept appropriately appended to the end of the word.
	 * 
	 * @param input
	 * 		--Single word to be converted
	 * @return
	 * 		--The word in Pig Latin
	 */
	public static String convert(String input)
	{
		String consonant = "";
		String temp = "";
		String punctuation = "";
		int consonantCount = 0;

		if(input == null || !Character.isLetter(input.charAt(0)))
			return input;
		
		if(!Character.isLetter(input.charAt(input.length()-1)))
		{
			punctuation += input.charAt(input.length()-1);
			input = input.substring(0, input.length()-1); 
		}
		
		if(charIsVowel(input.charAt(0)))
			return input + "way" + punctuation;
		
		//Save the consonant/consonant cluster at the begining of the word
		
		int j = 0;
		while (!charIsVowel(input.charAt(j)))
		{
			consonant += input.charAt(j);
			consonantCount++;
			j++;
			if(j > input.length()-1)
				return input + "way" + punctuation;
		}
		
		
		//Copy over all the letters after the initial consonant sound
		
		for(int i=0;i<input.length()-consonantCount;i++)
		{
			temp += input.charAt(i+consonantCount);
		}
		
		//Add the Pig Latin suffix.
		
		temp += consonant + pigLatin + punctuation;
		
		return temp;
	}
	
	/**
	 * Checks the char to see if it is a vowel (ie: aAeEiIoOuU)
	 * @param c
	 * 		--The char to be checked
	 * @return
	 * 		--True if is a vowel and false if not a vowel.
	 */
	public static boolean charIsVowel(char c) 
	{
		if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
			return true;
		return false;
	}
}
