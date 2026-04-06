/*
	Selection.java
	Last modified by J.Finn: 4-Apr-2026
	Implementation of Selection Sort
 */

import java.util.Arrays;

public class Selection
{
	/*
		swap (interchange) array elements a[first] and a[second]
	 */
	public static void swap (int [] a, int first, int second)
	{
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
	
	/*
		Sort a[0] .. a[n-1] using Selection sort
		n must be <= a.length
	 */
    public static void selectionSort (int[] a, int n) 
    {
		int min;
		for (int i = 0; i < n; i++) 
		{
	    	min = i;	// assume smallest already in place
			// find the smallest
			for (int j = i + 1; j < n; j++) 
				if (a[j] < a[min])
					min = j;
			if (i != min)
                swap(a, i, min);

		}
    }

    public static void main (String[] args) 
    {
		int [] a = { 5, 7, 9, 0, 20, 3};
		int [] asorted = { 0, 3, 5, 7, 9, 20 };
		// here is another way to print a whole array up to its length
		System.out.println(Arrays.toString(a));
		selectionSort(a, a.length);
		System.out.println(Arrays.toString(a));    	
		// Arrays.equals tests if two arrays have equal elements!
		if (Arrays.equals(a, asorted))
			System.out.println("Sort worked, yay!");
		else
			System.out.println("Sort failed, why oh why?");
    }
}

