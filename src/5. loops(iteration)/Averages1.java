/*
	Averages1.java
	Last modified by j.finn: 21-Mar-2026
	Solution to lab exercise 

	Program reads exactly ten integers 
	from the keyboard and then computes the average of all the even 
	integers and the average of all the odd integers separately, 
	then prints the two (double)s averages.

	This solution uses a while loop to avoid repeating code
 */

// This code has same output as the 'Lab_19-mar/Averages.java' file.
// But this code uses 'while' loops, so it is much easier to read compared to '5. loops(iteration)/Averages.java' file.
import java.util.Scanner; 

public class Averages1
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		int totalEven = 0;	// total of even numbers
		int countEven = 0;	// how many even numbers
		int totalOdd = 0;	// total of odd numbers
		int countOdd = 0;	// countOdd
		int n;			 	// to hold one input value
		int count = 1;		// count how many numbers read
		while (count <= 10)
		{
			System.out.print("Enter an integer value number " + count + ": ");
			n = scan.nextInt();
			if (n % 2 == 0)
			{
				totalEven = totalEven + n;
				// or totalEven += n
				countEven = countEven + 1;
				// or countEven++;
			}
			else
			{
				totalOdd += n;
				countOdd++;
			}
			count++;	// update count for next iteration
		}
		if (countOdd > 0)
			System.out.println("Average of odd numbers: " + 
				((double) totalOdd / countOdd));
		if (countEven > 0)
			System.out.println("Average of even numbers: " + 
				((double) totalEven / countEven));
		scan.close();
	}
}		
