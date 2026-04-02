/*
	Dup.java
	Last modified by j.finn: 26-Sep-2026
	Lab exercise to write a function that searches
	an integer array for a duplicated value.
 */

public class Dup 
{
	/*
		Function: dup
		Searches array range a[0] .. a[n-1]
			to find a duplicated value.
		Returns: index of first value that
			has a duplicate, or
			-1 if there are no duplicates
	 */
	public static int dup(int [] a, int n)
	{
		for(int i = 0;i < n ;i++){
			for(int j = i+1;j < n ;j++){
				if(a[i] == a[j]){
					return a[i];
				}
			}
		}
		return -1;
	}
	
    public static void main(String[] args) 
	{
		int [] a = { 5, 99, 24, 44, 24, 99, 101 };
		int [] b = { 5, 99, 24, 44, 101, 66 };
		int where;
		System.out.print("look for duplicate in a, should find one: ");
		where = dup(a, a.length);
		System.out.println(where);
		System.out.print("look for duplicate in b, should not find one: ");
		where = dup(b, b.length);
		System.out.println(where);
	}
}
