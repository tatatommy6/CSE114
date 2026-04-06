/*
	Table.java
	Last modified by j.finn: 31-Mar-2026.
	
	create a "2D" array of 3 rows where
		row 1 has length 3 and is initialized by an initializer
		row 2 has length 4 and is initialized by a for loop
		row 3 is uninitiazlied.
 */
public class Table 
{
	public static void main(String args[])
	{
		int i,j;
		int [] [] unsquare = new int[3][];
		unsquare[0] = new int [] { 1, 2, 3};
		unsquare[1] = new int[4];
		for (i = 0; i < 4; i++)
			unsquare[1][i] = i*10;
		for (i = 0; i < unsquare.length; i++)
		{
			if (unsquare[i] == null)
				System.out.println("null");
			else
			{
				for (j = 0; j < unsquare[i].length; j++)
					System.out.print(unsquare[i][j] + " ");
				System.out.println();
			}
		}		
	}
}
