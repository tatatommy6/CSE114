/*
	SimpleSearch.java
	Last modified by J.Finn: 4-Apr-2026
	Simple array search
 */

// import java.util.Arrays;

public class SimpleSearch
{

	/*
		search a[0] .. a[n-1] for value
		Return: index i where a[i] == value,
			or -1 if value not found.
	 */
    public static int search (int value, int[] a, int n) 
    {
		for (int i = 0; i < n; i++)
			if (a[i] == value) return i;
		return -1; 
    }

    public static void main (String[] args) 
    {
		int [] a = { 0, 7, 5, 9, 3, 20 };
		int [] searches = { 0, 3, 20, 10, 2 };
		int [] expected = { 0, 4, 5, -1, -1 };
		boolean failures = false;
		for (int i = 0; i < searches.length; i++)
		{
			int result = search(searches[i], a, a.length);
			if (result != expected[i])
			{
				failures = true;
				System.out.println("Error: search for " + searches[i] +	
					" returned " + result + ", expected " + expected[i]);
			}
		}
		if (!failures)
			System.out.println("All tests passed");
	}
}

