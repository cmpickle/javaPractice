package numbers;

/**
 * Prints out maxRow number of rows in Pascal's triangle.
 * 
 * @author Cameron Pickle
 */
public class PascalTriangle {

	public static void main(String[] args)
	{
		int maxRow = 20;
		String[] triangle = new String[maxRow];
		int maxRowLength;
		
		for (int i = 0; i < triangle.length; i++)
			triangle[i] = "";

		for (int i = 0; i < maxRow; i++)
			for (int j = 0; j <= i; j++)
				triangle[i] += (pascal(i, j) + " ");
		
		maxRowLength = triangle[triangle.length-1].length();
		
		for (int i = 0; i < triangle.length; i++)
			triangle[i] = printer(triangle[i], maxRowLength);
		
		for (int i = 0; i < triangle.length; i++)
			System.out.println(triangle[i] + "\n");
		
	}

	/**
	 * Returns the number for the given column and row in Pascal's triangle
	 * 
	 * @param col
	 * @param row
	 * @return
	 */
	private static int pascal(int col, int row)
	{
		if (row == 0)
			return 1;
		else if (col == row)
			return 1;
		else
			return pascal(col - 1, row) + pascal(col - 1, row - 1);
	}

	/**
	 * 
	 * @param str
	 * @param size
	 * @return
	 */
	static String printer(String str, int size)
	{
		int left = (size - str.length()) / 2;
		int right = size - left - str.length();
		
		String repeatedChar = " ";
		StringBuffer buff = new StringBuffer();
		
		for (int i = 0; i < left; i++)
			buff.append(repeatedChar);
		buff.append(str);
		
		for (int i = 0; i < right; i++)
			buff.append(repeatedChar);
		
		return buff.toString();
	}
}
