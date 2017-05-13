package text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LowerASCII {

	public static void main(String[] args) throws FileNotFoundException
	{
		lowerValues("I Am Legend.txt");
	}

	public static void lowerValues(String fileName) throws FileNotFoundException
	{
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		Scanner s = new Scanner(fis);
		String output = "";

		while (s.hasNext())
		{
			StringBuilder str = new StringBuilder(s.nextLine());
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) > 179)
					str.setCharAt(i, ' ');
			}
			output += str + "\n";
			
		}
		
		s.close();
		
		try
		{
			File fileOut = new File("Out" + fileName);

			// if file doesn't exists, then create it
			if (!fileOut.exists())
			{
				fileOut.createNewFile();
			}

			FileWriter fw = new FileWriter(fileOut.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(output);
			bw.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("Done");
	}
}
