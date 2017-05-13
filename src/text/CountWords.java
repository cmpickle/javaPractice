package text;
/**
 * This program counts the number of words in a given string of file.
 * 
 * @author Cameron Pickle
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] Args)
	{
		String s1 = "Hello World!";
		String s2 = "hey";
		String s3 = "What's it to ya anyway?";
		
		System.out.println("The String " + s1 + " contains " + countWords(s1) + " words.");
		System.out.println("The String " + s2 + " contains " + countWords(s2) + " words.");
		System.out.println("The String " + s3 + " contains " + countWords(s3) + " words.");
		System.out.println("The File PigLatin contains " + countWords("PigLatin.txt") + " words.");
		System.out.println("The File sample word list contains " + countWords("sample_word_list.txt") + " words.");
		System.out.println("The File I Am Legend contains " + countWords("I Am Legend.txt") + " words.");
		System.out.println("The File World War Z contains " + countWords("World War Z.txt") + " words.");
		System.out.println("The File Death Troopers contains " + countWords("Death Troopers.txt") + " words.");
		System.out.println("The File Red Harvest contains " + countWords("Red Harvest.txt") + " words.");
		System.out.println("The File The Count of Monte Cristo contains " + countWords("The Count of Monte Cristo.txt") + " words.");
	}
	
	/**
	 * Counts the number of words in a given string or file.
	 * @param input
	 * 		--The string or file name who's words will be counted
	 * @return
	 * 		--An integer value of the number of words
	 */
	public static int countWords(String input)
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
			String[] words = null;
			int total = 0;
		
			while(s.hasNextLine())
			{
				temp = s.nextLine();
				
				words = temp.split(" ");
				
				total += words.length;
			}
			return total;
		}
		
		String[] words = input.split(" ");
		return words.length;			
	}
}
