/*
 * UseArrayList.java
 * Last modified by J.Finn: 17-May-2026
 * use java.util.ArrayList as an array
 */

import java.util.ArrayList;

public class UseArrayList
{
	public static void main(String [] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int i;
		System.out.println("size = " + a.size());
		// add 20 ints to increase size to 20
		for (i = 0; i < 20; i++)
			a.add(i);
		System.out.println("size = " + a.size());
		// print using normal iteration
		for (i = 0; i < 20; i++)
			System.out.print(a.get(i) + " ");
		System.out.println();
		
		// now use like an array of size 20
		for (i = 0; i < 20; i++)
			a.set(i, 2*i);
			
		// print using normal iteration
		for (i = 0; i < 20; i++)
			System.out.print(a.get(i) + " ");
		System.out.println();
		
		// or with enhanced for loop
		for (Integer val: a)
			System.out.print(val + " ");
		System.out.println();
	}
};
