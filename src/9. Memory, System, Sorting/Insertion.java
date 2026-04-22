/*
	Insertion.java
	Last modified by J.Finn: 4-Apr-2026
	Implementation of Insertion Sort
 */

import java.util.Arrays;

public class Insertion
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
    public static void insertionSort (int[] a, int n) 
    {
		for (int i = 1; i < n; i++) 
		{
			for (int j = i;	j > 0 && a[j] < a[j-1]; j--)
				swap(a, j, j-1);
		}
    }

    public static void main (String[] args) 
    {
		int [] a = { 0, 7, 5, 9, 3, 20 };
		int [] asorted = { 0, 3, 5, 7, 9, 20 };
		System.out.println(Arrays.toString(a));
		insertionSort(a, a.length);
		System.out.println(Arrays.toString(a));
		if (Arrays.equals(a, asorted))
			System.out.println("Sort worked, yay!");
		else
			System.out.println("Sort failed, why oh why?");
    }
}