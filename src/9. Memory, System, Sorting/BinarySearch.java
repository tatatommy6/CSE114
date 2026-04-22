/*
	BinarySearch.java
	Last modified by J.Finn: 4-Apr-2026
	Binarysearch of sorted array
 */
 
// import java.util.Arrays;

public class BinarySearch
{

	/*
		a must be sorted
		search a[low] .. a[high-1] for value
		Return: index i where a[i] == value,
			or -1 if value not found.
	 */
    public static int binsearch (int value, int[] a, int low, int high) 
    {
		high--;
		while (low <= high)
		{
			int middle = (low + high) / 2;
			if (a[middle] == value) return middle;
			if (a[middle] < value) low = middle + 1;
			else high = middle - 1;
		}
		return -1; 
    }

    public static void main (String[] args) 
    {
		int [] a = { 0, 3, 5, 7, 9, 20 };
		int [] searches = { 0, 3, 20, 10, 2 };
		int [] expected = { 0, 1, 5, -1, -1 };
		boolean failures = false;
		for (int i = 0; i < searches.length; i++)
		{
			int result = binsearch(searches[i], a, 0, a.length);
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

