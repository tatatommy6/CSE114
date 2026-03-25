/*
	Reverse.java
	Last modified by j.finn: 21-Mar-2026
	Program reads int values until end of file, then
	prints them in reverse order to which they were entered.
	An array is used to store the values.
	Program can read and store up to MAX values.
 */
	
import java.util.Scanner;

public class Reverse {
	public static final int MAX = 100;
	
    public static void main(String[] args) {
		int [] a = new int[MAX];	// all numbers read
		int n;						// how many input values read
		Scanner scan  = new Scanner(System.in);
		int input;
		for (n = 0; n < a.length; n++) {// this loop has exit tests in two places!
			System.out.print("Enter int value (ctrl-d to quit): ");
			if (!scan.hasNextInt())		// no more input
				break;
			input = scan.nextInt();
			a[n] = input;
		}
		
		n--; 	// number of inputs = highest array position used + 1
		System.out.println("The numbers in reverse:");
		while (n >= 0) {
			System.out.print(a[n] + " ");
			n--;
		}
		System.out.println();
		scan.close();
	}
}
