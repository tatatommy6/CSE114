/*
	Search.java
	Last modified by j.finn: 26-Mar-2026
	Lab exercise to write a function that searches
	an integer array for a given value.
 */

public class Search 
{
	/*
		Function: search
		Searches array a in range a[0]..a[n-1] for value val.
		Returns: index in array where value is found, or
			-1 if it is not found.
	 */
	
	public static int search(int [] a, int n, int val)
	{
		for(int i = 0;i < n ;i++){
			if(a[i] == val){
				return i;
			}
		}
		return -1;
	}
	
    public static void main(String[] args) 
	{
		int [] a = { 5, 99, 24, 44, 24, 99, 101 };
		int where;
		System.out.print("look for 44, should find it: ");
		where = search(a, a.length, 44);
		System.out.println(where);
		System.out.print("look for 7, should not find it: ");
		where = search(a, a.length, 7);
		System.out.println(where);
	}
}
