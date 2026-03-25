/*
	Reverse2.java
	Last modified by j.finn: 21-Mar-2026s
	Program reads int values until end of file, then
	prints them in reverse.
	An array is used to store the values.
	Program can read and store up to MAX values.
	This version uses functions to read and print the array
 */
	
import java.util.Scanner;

public class Reverse2 {
	public static final int MAX = 100;
	
	/*
		readArray
		Read values until end of file or until array is full and store in a.
		Return: number of values read
	 */
	public static int readArray(int [] a) {
		int n;						// how many input values read
		Scanner scan  = new Scanner(System.in);
		int input;
		for (n = 0; n < a.length; n++) { // this loop has exit tests in two places!
			System.out.print("Enter int value (ctrl-d to quit): ");
			if (!scan.hasNextInt())		// no more input
				break;
			input = scan.nextInt();
			a[n] = input;
		}
		scan.close();
		return n;
	}
	
	/*
		print the first n values of array a in reverse
	 */
	public static void printReverse(int [] a, int n) {
		n--;
		System.out.println("The numbers in reverse:");
		while (n >= 0){
			System.out.print(a[n] + " ");
			n--;
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
		int [] a = new int[MAX];
		int n = readArray(a);
		printReverse(a, n);
	}
}
