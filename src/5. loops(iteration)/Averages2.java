/*
	Averages2.java
	Last modified by j.finn: 21-Mar-2026
	Solution to lab exercise 

	Program reads exactly ten integers 
	from the keyboard and then computes the average of all the even 
	integers and the average of all the odd integers separately, 
	then prints the two (double)s averages.

	When you need to repeat a loop exactly n times, as in Averages1,
	the while loop typically has a structure similar to this:
		count = 1;
		while (count <= n)
		{
			// do some stuff
			count++
		}
		
	This can be abbreviated by a Java for loop, which collects
		all the "loop control" information into the top of the
		statement:
		
		for (count = 1; count <= 10; count++)
		{
			// do some stuff
		}
		
	This for loop has the same meaning as the while loop.
	
	Given the for loop header 
		for(E1 ; E2 : E3)
			loopBody;
	
	E1 is done once, BEFORE anything else
		If E1 is omitted, nothing is done.
	E2 is the loop exit test and is made before the loopBody is executed
		If E2 is omitted, it is taken as always true 
		(infinite loop, should be a break in the body)
	E3 is the "update" and is done immediately following the loopBody
		but before E2 is evaluated again for the next iteration of the loop
		If E3 is omitted, nothing is done
		
	The above for loop is equivalent to
	
		E1
		while(E2)
		{
			loopBody;
			E3;
		}
		
	Finally, Java programmers like to count from zero, so this loop
	would usually be written as
		
		for (count = 0; count < 10; count++)
		{
			// do some stuff
		}
 */

// This code has same output as the 'Lab_19-mar/Averages.java' file.
// And uses 'for' loops, same as me.
// But if there are no even or odd numbers, nothing will be printed for that case.

import java.util.Scanner; 

public class Averages2
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		int totalEven = 0;	// total of even numbers
		int countEven = 0;	// how many even numbers
		int totalOdd = 0;	// total of odd numbers
		int countOdd = 0;	// countOdd
		int n;			 	// to hold one input value
		for (int count = 0; count < 10; count++) {
			// we add 1 to the count before printing: we count from zero
			// but users do not
			System.out.print("Enter an integer value number " + (count+1) + ": ");
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
		}
		// When we write only one line in if statement, it is ok to NOT use '{}'.
		if (countOdd > 0)
			System.out.println("Average of odd numbers: " + ((double) totalOdd / countOdd));
		if (countEven > 0)
			System.out.println("Average of even numbers: " + ((double) totalEven / countEven));
		scan.close();
	}
}		
