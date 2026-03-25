/*
	ValueRef.java
	Last modified by j.finn: 21-Mar-2026
	Illustrates the difference between references and primitive values
 */
	
// import java.util.Scanner;

public class ValueRef {
	public static void modifyInt(int x) {
		System.out.println("\tModify local x = " + x);
		x = x * 5;
		System.out.println("\tx is now " + x);
	}
	
	public static void modifyArray(int [] ar) {
		if (ar.length >= 2) {
			System.out.print("\t swap first two array elements of array ");
			printArray(ar);
			int temp = ar[0];
			ar[0] = ar[1];
			ar[1] = temp;
			System.out.print("\t after swapping array is ");
			printArray(ar);
		}
	}
    
    public static void printArray(int [] a) {
		for (int item: a)
			System.out.print(item + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println("About to call modifyInt on x = " + x);
		modifyInt(x);
		System.out.println("After call, x = " + x);

		int [] a = {3, 1, 4, 1, 5, 9, 2, 7};
		System.out.print("About to modify array ");
		printArray(a);
		modifyArray(a);
		System.out.print("After call, array = ");
		printArray(a);
	}
}
