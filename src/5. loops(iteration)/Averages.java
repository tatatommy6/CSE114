/*
	Averages.java
	Last modified by j.finn: 19-Mar-2026

	Exercise: Write a program that reads exactly ten integers 
	from the keyboard and then computes the average of all the even 
	integers and the average of all the odd integers separately, 
	then prints the two (double)s averages.

	We are about to learn about loops and iteration, which will
	allow a simpler solution to this exercise without so much
	duplicated code for each of the ten 10 input integers.
	
	Remember, your computer can copy and paste, but better
	days are coming.
 */
// So this code is same as the one in the 'Lab_19-mar/Averages.java' file.
// But this code didn`t used 'for' loops, so it is very long and hard to read.

import java.util.Scanner; 

public class Averages 
{
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalEven = 0;	// total of even numbers
		int countEven = 0;	// how many even numbers
		int totalOdd = 0;	// total of odd numbers
		int countOdd = 0;	// countOdd
		int n;			 	// to hold one input value
		System.out.print("Enter an integer value: ");
		n = scan.nextInt();
		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();

		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();

		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();
		
		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();

		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();
		
		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();

		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();

		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}
		
		System.out.print("Enter an integer value: ");
		n = scan.nextInt();

		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}

		System.out.print("Enter an integer value: ");
		n = scan.nextInt();

		if (n % 2 == 0) {
			totalEven = totalEven + n;
			// or totalEven += n
			countEven = countEven + 1;
			// or countEven++;
		}
		else {
			totalOdd += n;
			countOdd++;
		}


		if (countOdd > 0)
			System.out.printf("Average of odd numbers: %.2f\n",
				(double) totalOdd / countOdd);
		if (countEven > 0)
			System.out.printf("Average of even numbers: %.2f\n" , 
				(double) totalEven / countEven);
		scan.close();
	}
}		
