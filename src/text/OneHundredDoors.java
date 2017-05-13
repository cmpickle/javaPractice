package text;

/**
 * A program that solves the riddle: 
 * You have 100 doors in a row that are all initially closed. You make 100 passes by
 * the doors. The first time through, you visit every door and toggle the door (if the door is closed, you open it; if
 * it is open, you close it). The second time you only visit every 2nd door (door #2, #4, #6, ...). The third time,
 * every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.
 * 
 * @author Cameron Pickle
 *
 */
public class OneHundredDoors {

	public static void main(String[] args)
	{
		boolean[] doors = new boolean[100];

		for (int i = 0; i < 100; i++)
			doors[i] = false;

		for (int pass = 1; pass <= 100; pass++)
		{
			for (int door = 1; door <= 100; door++)
				if (door % pass == 0)
					doors[door - 1] = !doors[door - 1];
		}

		for (int i = 0; i < 100; i++)
		{
			if (doors[i])
				System.out.println("open");
			else
				System.out.println("closed");
		}
	}

}
