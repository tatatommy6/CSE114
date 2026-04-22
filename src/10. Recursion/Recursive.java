/*
	Recursive.java
	Last modified by J.Finn: 12-Apr-2026
	Recursive function examples
 */

// import java.util.Scanner;

public class Recursive
{

	/*
		Function: expon
		Returns: base to the power exp.
		exp must be non-negative.
	 */
	public static long expon(long base, long exp)
	{
		if (exp == 0) return 1;
		else return (base * expon(base, exp-1));
	}

	/*
		Function: fact
		Returns: n!
		n must be non-negative.
	 */
	public static long fact(int n)
	{
		if (n == 0) return 1;
		else return (n * fact(n-1));
	}
	
	/*
		Function: findmax
		Returns: the maximum value in the
			range a[low] ... a[high].
		low must be <= high.
	 */
	public static int findmax(int a[], int low, int high)
	{
		if (low == high) return a[low];
		else
		{
			int maxrest = findmax(a, low+1, high);
			if (maxrest > a[low]) return maxrest;
			else return a[low];
		}
	}

	/*
	 * Search the array range a[low] ... a[high] for value.
	 * If found, return an index i where a[i] == value.
	 * If not found, return -1.
	 * low must be <= high.
	 */
	public static int lookup(int a[], int low, int high, int value)
	{
		if (a[low] == value) return low;
		else if (low == high) return -1;
		else return lookup(a, low+1, high, value);			
	}

	/*
	 * Search the array range a[low] ... a[high] for value.
	 * If found, return an index i where a[i] == value.
	 * If not found, return -1.
	 * low must be <= high.
	 * The array must be sorted.
	 */
	public static int binarySearch(int a[], int low, int high, int value)
	{
		if (low > high) return -1; 		// empty range!
		int middle = (low + high) / 2;
		if (a[middle] == value) return middle;
		else if (a[middle] < value) 
			return binarySearch(a, middle+1, high, value);
		else return binarySearch(a, low, middle-1, value);
	}

    public static void main (String[] args) 
    {
    	int [] vals = { 0, 1, 5, 10};
    	long [] facts = { 1, 1, 120, 3628800};
		boolean failures = false;
		int i;
		for (i = 0; i < vals.length; i++)
		{
			long result = fact(vals[i]);
			if (result != facts[i])
			{
				failures = true;
				System.out.println(vals[i] +	
					"! returned " + result + ", expected " + facts[i]);
			}
		}
		if (!failures)
			System.out.println("All fact tests passed");
			
		long [] bases = {2, 2, 3, 0};
		long [] exps = {3, 0, 4, 99};
		long [] pows = {8, 1, 81, 0};
		
		failures = false;
		for (i = 0; i < vals.length; i++)
		{
			long result = expon(bases[i], exps[i]);
			if (result != pows[i])
			{
				failures = true;
				System.out.println("expon(" + bases[i] + ", " + exps[i] +	
					") returned " + result + ", expected " + pows[i]);
			}
		}
		if (!failures)
			System.out.println("All expon tests passed");
			
		int a1[] = { 5 };
		int a2[] = { 5, 9, 4, 14, 50 };
		
		failures = false;
		int m = findmax(a1, 0, 0);
		if (m != 5)
		{
			failures = true;
			System.out.println("findmax error a1, should be 5, was " + m);
		}
		m = findmax(a2, 0, 4);
		if (m != 50)
		{
			failures = true;
			System.out.println("findmax error a2, should be 50, was " + m);
		}
		if (!failures)
			System.out.println("All findmax tests passed");
		

		int [] look = { 99, 5, 50, 4, -3 };
		int [] lookres = { -1, 0, 4, 2, -1};
		failures = false;
		for (i = 0; i < look.length; i++)
		{
			int result = lookup(a2, 0, a2.length-1, look[i]);
			if (result != lookres[i])
			{
				failures = true;
				System.out.println("lookup(" + look[i] +	
					") returned " + result + ", expected " + lookres[i]);
			}
		}
		if (!failures)
			System.out.println("All lookup tests passed");

		int [] a3 = { 0, 3, 5, 7, 9, 20 };
		int [] searches = { 0, 4, 3, 20};
		int [] expected = { 0, -1, 1, 5};
		failures = false;
		for (i = 0; i < searches.length; i++)
		{
			int result = binarySearch(a3, 0, a3.length-1, searches[i]);
			if (result != expected[i])
			{
				failures = true;
				System.out.println("Error: binary search for " + searches[i] +	
					" returned " + result + ", expected " + expected[i]);
			}
		}
		if (!failures)
			System.out.println("All binary search tests passed");
	}
}

